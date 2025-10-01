package com.project.event_master.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.project.event_master.domain.user.CreateUserDTO;
import com.project.event_master.domain.user.UpdateUserDTO;
import com.project.event_master.domain.user.UserEntity;
import com.project.event_master.domain.user.UserResponseDTO;
import com.project.event_master.repositories.UserRepository;
import com.project.event_master.services.exceptions.RecordNotFoundException;
import com.project.event_master.services.exceptions.ValidationException;
import com.project.event_master.services.util.UserMapper;
import com.project.event_master.services.validation.CPFValidation;

@Service
public class UserService {

    // DEPENDENCY INJECTION
    private UserRepository repository;
    private CPFValidation validation;
    private UserMapper mapper;

    private UserService(UserRepository repository, CPFValidation validation, UserMapper mapper) {
        this.repository = repository;
        this.validation = validation;
        this.mapper = mapper;
    }

    public UserResponseDTO createNewUser(CreateUserDTO user) {
        if (!validation.validateCPF(user.getCpf()))
        {
            throw new ValidationException("Número de CPF inválido");
        }
        UserEntity newUser = mapper.toEntity(user);
        return mapper.toDto(repository.save(newUser));
    }

    public List<UserResponseDTO> findAllUsers() {
        return repository.findAll().stream()
            .map(user -> mapper.toDto(user))
            .collect(Collectors.toList());
    }

    public UserResponseDTO findUserById(Long id) {
        return mapper.toDto(repository.findById(id)
            .orElseThrow(() -> new RecordNotFoundException("Usuário", id)));
    }

    public UserResponseDTO updateUser(UpdateUserDTO user, Long id) {
        if (user.getCpf() != null && !validation.validateCPF(user.getCpf())) {
            throw new ValidationException("Número de CPF inválido!");
        }
        UserEntity userToUpdate = repository.findById(id)
            .orElseThrow(() -> new RecordNotFoundException("Usuário", id));
        mapper.updateEntityFromDto(user, userToUpdate);
        return mapper.toDto(repository.save(userToUpdate));
    }

    public void deleteUser(Long id) {
        if (!repository.existsById(id)) {
            throw new RecordNotFoundException("Usuário", id);
        }
        repository.deleteById(id);
    }

}
