package com.project.event_master.application.usecases.user;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.project.event_master.application.services.UserService;
import com.project.event_master.application.usecases.UseCase;
import com.project.event_master.domain.entities.UserEntity;
import com.project.event_master.dtos.user.RegisterUserDTO;
import com.project.event_master.dtos.user.UserResponseDTO;
import com.project.event_master.exceptions.ValidationException;
import com.project.event_master.mappers.UserMapper;
import com.project.event_master.validation.CPFValidation;

public class RegisterUserUseCase implements UseCase<RegisterUserDTO, UserResponseDTO>{

    private final UserService service;
    private final UserMapper mapper;
    private final CPFValidation validation;

    public RegisterUserUseCase(UserService service, UserMapper mapper, CPFValidation validation) {
        this.service = service;
        this.mapper = mapper;
        this.validation = validation;
    }

    public UserResponseDTO execute(RegisterUserDTO dto) {
        if(!validation.validateCPF(dto.getCpf()))
        {
            throw new ValidationException("Número de CPF inválido");
        }
        
        service.usernameExists(dto.getUsername());
                
        dto.setPassword(new BCryptPasswordEncoder().encode(dto.getPassword()));
        
        UserEntity newUser = mapper.toEntity(dto);
        return mapper.toDto(service.createNewUser(newUser));
    }

}
