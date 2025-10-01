package com.project.event_master.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.event_master.domain.user.UserEntity;
import com.project.event_master.repositories.UserRepository;
import com.project.event_master.services.exceptions.RecordNotFoundException;
import com.project.event_master.services.exceptions.ValidationException;
import com.project.event_master.services.validation.CPFValidation;

@Service
public class UserService {

    // DEPENDENCY INJECTION
    private UserRepository repository;
    private CPFValidation validation;

    private UserService(UserRepository repository, CPFValidation validation) {
        this.repository = repository;
        this.validation = validation;
    }

    public UserEntity createNewUser(UserEntity user) {
        if (!validation.validateCPF(user.getCpf()))
        {
            throw new ValidationException("Número de CPF inválido");
        }
        return repository.save(user);
    }

    public List<UserEntity> findAllUsers() {
        return repository.findAll();
    }

    public UserEntity findUserById(Long id) {
        return repository.findById(id)
            .orElseThrow(() -> new RecordNotFoundException("Usuário", id));
    }

    public UserEntity updateUser(UserEntity user, Long id) {
        return repository.findById(id)
            .map(updateUser -> {
                if (!validation.validateCPF(user.getCpf())) 
                {
                    throw new ValidationException("Número de CPF inválido");
                }
                updateUser.setName(user.getName());
                updateUser.setBirthDate(user.getBirthDate());
                updateUser.setCpf(user.getCpf());
                updateUser.setAddress(user.getAddress());
                return repository.save(updateUser);
            }
        ).orElseThrow(() -> new RecordNotFoundException("Usuário", id));
    }

    public void deleteUser(Long id) {
        repository.delete(findUserById(id));
    }

}
