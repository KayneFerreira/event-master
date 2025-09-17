package com.project.event_master.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
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

    /** Create new user */
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public UserEntity createNewUser(@RequestBody UserEntity user) {
        return service.createNewUser(user);
    }

    /** List all existing users  */
    @GetMapping
    @ResponseBody
    @ResponseStatus(code = HttpStatus.OK)
    public List<UserEntity> findAllUsers() {
        return service.findAllUsers();
    }

    /** Find user by id */
    @GetMapping("/{id}")
    @ResponseBody
    @ResponseStatus(code = HttpStatus.OK)
    public Optional<UserEntity> findUserById(@PathVariable Long id) {
        return service.findUserById(id);
    }

    /** Update existing user */
    @PutMapping("/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public UserEntity updateUser(@RequestBody UserEntity user, @PathVariable Long id) {
        return service.updateUser(user, id);
    }

    /** Delete user by id */
    @DeleteMapping("/{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void deleteUser(@PathVariable Long id) {
        service.deleteUser(id);
    }
}
