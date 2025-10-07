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

import com.project.event_master.application.usecases.user.CreateUserUseCase;
import com.project.event_master.application.usecases.user.DeleteUserUseCase;
import com.project.event_master.application.usecases.user.FindAllUsersUseCase;
import com.project.event_master.application.usecases.user.FindUserByIdUseCase;
import com.project.event_master.application.usecases.user.UpdateUserInput;
import com.project.event_master.application.usecases.user.UpdateUserUseCase;
import com.project.event_master.dtos.user.CreateUserDTO;
import com.project.event_master.dtos.user.UpdateUserDTO;
import com.project.event_master.dtos.user.UserResponseDTO;

@RestController
@RequestMapping("/api/test/users")
public class UserController {

    // DEPENDENCY INJECTION
    private final CreateUserUseCase createNewUser;
    private final FindAllUsersUseCase findAllUsers;
    private final FindUserByIdUseCase findUserById;
    private final UpdateUserUseCase updateUser;
    private final DeleteUserUseCase deleteUser;

    private UserController(CreateUserUseCase createNewUser,
                            FindAllUsersUseCase findAllUsers,
                            FindUserByIdUseCase findUserById,
                            UpdateUserUseCase updateUser,
                            DeleteUserUseCase deleteUser) {
        this.createNewUser = createNewUser;
        this.findAllUsers = findAllUsers;
        this.findUserById = findUserById;
        this.updateUser = updateUser;
        this.deleteUser = deleteUser;
    }

    @PostMapping
    public ResponseEntity<UserResponseDTO> createNewUser(@RequestBody CreateUserDTO user) {
        UserResponseDTO response = createNewUser.execute(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping
    public ResponseEntity<List<UserResponseDTO>> findAllUsers() {
        List<UserResponseDTO> response = findAllUsers.execute(null);
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserResponseDTO> findUserById(@PathVariable Long id) {
        UserResponseDTO response = findUserById.execute(id);
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

    @PutMapping("/{id}")
    public ResponseEntity<UserResponseDTO> updateUser(@RequestBody UpdateUserDTO user, 
                                                        @PathVariable Long id) {
        UpdateUserInput userInput = new UpdateUserInput(id, user);
        UserResponseDTO response = updateUser.execute(userInput);
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        deleteUser.execute(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
