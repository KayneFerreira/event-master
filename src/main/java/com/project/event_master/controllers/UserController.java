package com.project.event_master.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.event_master.application.services.UserService;
import com.project.event_master.dtos.user.CreateUserDTO;
import com.project.event_master.dtos.user.UpdateUserDTO;
import com.project.event_master.dtos.user.UserResponseDTO;

@RestController
@RequestMapping("/api/test/users")
public class UserController {

    // DEPENDENCY INJECTION
    private UserService service;

    private UserController(UserService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<UserResponseDTO> createNewUser(@RequestBody CreateUserDTO user) {
        UserResponseDTO response = service.createNewUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping
    public ResponseEntity<List<UserResponseDTO>> findAllUsers() {
        List<UserResponseDTO> response = service.findAllUsers();
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserResponseDTO> findUserById(@PathVariable Long id) {
        UserResponseDTO response = service.findUserById(id);
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

    @PutMapping("/{id}")
    public ResponseEntity<UserResponseDTO> updateUser(@RequestBody UpdateUserDTO user, 
                                                      @PathVariable Long id) {
        UserResponseDTO response = service.updateUser(user, id);;
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        service.deleteUser(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
