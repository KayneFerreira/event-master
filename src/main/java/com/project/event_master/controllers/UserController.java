package com.project.event_master.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.project.event_master.entities.UserEntity;
import com.project.event_master.services.UserService;

@RestController
@RequestMapping("/api/test/users")
public class UserController {

    // DEPENDENCY INJECTION
    private UserService service;

    private UserController(UserService service) {
        this.service = service;
    }

    // CRUD
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public UserEntity createNewUser(@RequestBody UserEntity user) {
        return service.createNewUser(user);
    }
}
