package com.project.event_master.application.usecases.user;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;

import com.project.event_master.application.usecases.UseCase;
import com.project.event_master.dtos.user.AuthUserResponseDTO;
import com.project.event_master.dtos.user.AuthenticateUserDTO;
import com.project.event_master.dtos.user.UserResponseDTO;
import com.project.event_master.mappers.UserMapper;
import com.project.event_master.security.auth.UserDetailsImpl;
import com.project.event_master.security.jwt.TokenService;

public class AuthenticateUserUseCase implements UseCase<AuthenticateUserDTO, ResponseEntity<AuthUserResponseDTO>>{
	
	private final AuthenticationManager authManager;
	
	private final UserMapper mapper;
	
	private final TokenService tokenService;
	
	public AuthenticateUserUseCase(AuthenticationManager authManager, UserMapper mapper, TokenService tokenService) {
		this.authManager = authManager;
		this.mapper = mapper;
		this.tokenService = tokenService;
	}
	
	public ResponseEntity<AuthUserResponseDTO> execute(AuthenticateUserDTO dto) {
		var credentials = new UsernamePasswordAuthenticationToken(
				dto.username(), dto.password());
		Authentication auth = authManager.authenticate(credentials);
		
		if(!(auth.getPrincipal() instanceof UserDetailsImpl userDetails)) {
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
		}
		return ResponseEntity.ok(buildAuthenticatedUser(userDetails));
	}
	
	private AuthUserResponseDTO buildAuthenticatedUser(UserDetailsImpl userDetails) {
		UserResponseDTO responseDto = mapper.toResponseDto(userDetails);
		String token = tokenService.generateToken(mapper.toAuthenticateUserDto(responseDto));
		return new AuthUserResponseDTO(responseDto, token);
	}

}
