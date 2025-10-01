package com.project.event_master.controllers;

import java.util.List;

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

import com.project.event_master.domain.user.CreateUserDTO;
import com.project.event_master.domain.user.UpdateUserDTO;
import com.project.event_master.domain.user.UserResponseDTO;
import com.project.event_master.services.UserService;

@RestController
@RequestMapping("/api/test/users")
public class UserController {

    // DEPENDENCY INJECTION
    private UserService service;

    private UserController(UserService service) {
        this.service = service;
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public UserResponseDTO createNewUser(@RequestBody CreateUserDTO user) {
        return service.createNewUser(user);
    }

    @GetMapping
    @ResponseBody
    @ResponseStatus(code = HttpStatus.OK)
    public List<UserResponseDTO> findAllUsers() {
        return service.findAllUsers();
    }

    @GetMapping("/{id}")
    @ResponseBody
    @ResponseStatus(code = HttpStatus.OK)
    public UserResponseDTO findUserById(@PathVariable Long id) {
        return service.findUserById(id);
    }

    @PutMapping("/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public UserResponseDTO updateUser(@RequestBody UpdateUserDTO user, @PathVariable Long id) {
        return service.updateUser(user, id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void deleteUser(@PathVariable Long id) {
        service.deleteUser(id);
    }
}
