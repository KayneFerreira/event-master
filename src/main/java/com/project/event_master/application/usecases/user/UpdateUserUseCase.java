package com.project.event_master.application.usecases.user;

import com.project.event_master.application.services.UserService;
import com.project.event_master.application.usecases.UseCase;
import com.project.event_master.domain.entities.UserEntity;
import com.project.event_master.dtos.user.UpdateUserDTO;
import com.project.event_master.dtos.user.UserResponseDTO;
import com.project.event_master.exceptions.ValidationException;
import com.project.event_master.mappers.UserMapper;
import com.project.event_master.validation.CPFValidation;

public class UpdateUserUseCase implements UseCase<UpdateUserInput, UserResponseDTO> {

    // DEPENDENCY INJECTION
    private final UserService service;
    private final UserMapper mapper;
    private final CPFValidation validation;

    public UpdateUserUseCase(UserService service, UserMapper mapper, CPFValidation validation) {
        this.service = service;
        this.mapper = mapper;
        this.validation = validation;
    }

    public UserResponseDTO execute(UpdateUserInput userInput) {
        UpdateUserDTO newUser = userInput.getDto();
        if (newUser.getCpf() != null && !validation.validateCPF(newUser.getCpf())) {
            throw new ValidationException("Número de CPF inválido!");
        }
        UserEntity userToUpdate = service.findUserById(userInput.getId());
        mapper.updateEntityFromDto(newUser, userToUpdate);
        return mapper.toDto(service.updateUser(userToUpdate));
    }

}
