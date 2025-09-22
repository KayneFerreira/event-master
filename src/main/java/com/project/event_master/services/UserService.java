package com.project.event_master.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.event_master.entities.UserEntity;
import com.project.event_master.repositories.UserRepository;
import com.project.event_master.services.exceptions.RecordNotFoundException;

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

    public UserEntity findUserById(Long id) {
        return repository.findById(id)
            .orElseThrow(() -> new RecordNotFoundException(id));
    }

    public UserEntity updateUser(UserEntity user, Long id) {
        return repository.findById(id)
            .map(updateUser -> {
                updateUser.setName(user.getName());
                updateUser.setBirthDate(user.getBirthDate());
                updateUser.setAddress(user.getAddress());
                return repository.save(updateUser);
            }
        ).orElseThrow(() -> new RecordNotFoundException(id));
    }

    public void deleteUser(Long id) {
        repository.delete(findUserById(id));
    }

}
