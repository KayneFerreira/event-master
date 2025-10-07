package com.project.event_master.application.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.event_master.domain.entities.UserEntity;
import com.project.event_master.domain.repositories.UserRepository;
import com.project.event_master.exceptions.RecordNotFoundException;

@Service
public class UserService {

    // DEPENDENCY INJECTION
    private final UserRepository repository;

    private UserService(UserRepository repository) {
        this.repository = repository;
    }

    public UserEntity createNewUser(UserEntity user) {
        return repository.save(user);
    }

    public List<UserEntity> findAllUsers() {
        return repository.findAll();
    }

    public UserEntity findUserById(Long id) {
        return repository.findById(id)
            .orElseThrow(() -> new RecordNotFoundException("Usuário", id));
    }

    public UserEntity updateUser(UserEntity user) {
        return repository.save(user);
    }

    public void deleteUser(Long id) {
        if (!repository.existsById(id)) {
            throw new RecordNotFoundException("Usuário", id);
        }
        repository.deleteById(id);
    }

}
