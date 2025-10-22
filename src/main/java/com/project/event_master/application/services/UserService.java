package com.project.event_master.application.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.event_master.domain.entities.UserEntity;
import com.project.event_master.domain.repositories.UserRepository;
import com.project.event_master.exceptions.RecordNotFoundException;
import com.project.event_master.exceptions.UsernameAvailableException;

@Service
public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
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

    public UserEntity findUserByUsername(String username) {
        return repository.findByUsername(username)
            .orElseThrow(() -> new UsernameAvailableException(username));
    }
    
    public void usernameExists(String username) {
    	if (repository.existsByUsername(username)) {
    		throw new UsernameAvailableException(username);
    	}
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
