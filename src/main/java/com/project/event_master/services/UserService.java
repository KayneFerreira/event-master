package com.project.event_master.services;

import java.util.List;
import java.util.Optional;

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

    public UserEntity createNewUser(UserEntity user) {
        return repository.save(user);
    }

    public List<UserEntity> findAllUsers() {
        return repository.findAll();
    }

    // CHANGE -> MUST THROW EXCEPTION (CREATE CUSTOM EXCEPTION)
    public Optional<UserEntity> findUserById(Long id) {
        return repository.findById(id);
    }

    // WARN: MAY NEED CHANGES
    public UserEntity updateUser(UserEntity user, Long id) {
        UserEntity updateUser = repository.findById(id).get();
        updateUser.setName(user.getName());
        updateUser.setBirthDate(user.getBirthDate());
        updateUser.setAddress(user.getAddress());
        return repository.save(updateUser);
    }

    // CHANGE -> MUST THROW EXCEPTION (CREATE CUSTOM EXCEPTION)
    public void deleteUser(Long id) {
        repository.deleteById(id);
    }

}
