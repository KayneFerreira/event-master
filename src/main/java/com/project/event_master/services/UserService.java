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

    /** Create new user */
    public UserEntity createNewUser(UserEntity user) {
        return repository.save(user);
    }

    /** List all existing users  */
    public List<UserEntity> findAllUsers() {
        return repository.findAll();
    }

    // CHANGE -> MUST THROW EXCEPTION (CREATE CUSTOM EXCEPTION)
    /** Find user by id */
    public Optional<UserEntity> findUserById(Long id) {
        return repository.findById(id);
    }

    // WARN: MAY NEED CHANGES
    /** Update existing user */
    public UserEntity updateUser(UserEntity user, Long id) {
        UserEntity updateUser = repository.findById(id).get();
        updateUser.setName(user.getName());
        updateUser.setBirthDate(user.getBirthDate());
        return repository.save(updateUser);
    }

    // CHANGE -> MUST THROW EXCEPTION (CREATE CUSTOM EXCEPTION)
    /** Delete user by id */
    public void deleteUser(Long id) {
        repository.deleteById(id);
    }

}
