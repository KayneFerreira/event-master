package com.project.event_master.services;

import org.springframework.stereotype.Service;

import com.project.event_master.entities.UserEntity;
import com.project.event_master.repositories.UserRepository;

@Service
public class UserService {

    // DEPENDENCY INJECTION
    private UserRepository repository;

    private UserService(UserRepository repository) {
        this.repository = repository;
    }

    // CRUD
    public UserEntity createNewUser(UserEntity user) {
        return repository.save(user);
    }

}
