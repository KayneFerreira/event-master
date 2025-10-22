package com.project.event_master.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.event_master.application.usecases.user.AuthenticateUserUseCase;
import com.project.event_master.application.usecases.user.RegisterUserUseCase;
import com.project.event_master.dtos.user.AuthUserResponseDTO;
import com.project.event_master.dtos.user.AuthenticateUserDTO;
import com.project.event_master.dtos.user.RegisterUserDTO;
import com.project.event_master.dtos.user.UserResponseDTO;


@RestController
@RequestMapping("/api/test/auth")
public class AuthController {
	
	private final RegisterUserUseCase registerUser;
	private final AuthenticateUserUseCase authenticateUser;
	
	public AuthController(
			RegisterUserUseCase registerUser,
			AuthenticateUserUseCase authenticateUser)
	{
		this.registerUser = registerUser;
		this.authenticateUser = authenticateUser;
	}

	@PostMapping("/login")
	public ResponseEntity<AuthUserResponseDTO> login(@RequestBody AuthenticateUserDTO user) {
		return authenticateUser.execute(user);
	}
	
	@PostMapping("/register")
	public ResponseEntity<UserResponseDTO> register(@RequestBody RegisterUserDTO user) {
		UserResponseDTO response = registerUser.execute(user);
		return ResponseEntity.status(HttpStatus.CREATED).body(response);
	}
	
}
