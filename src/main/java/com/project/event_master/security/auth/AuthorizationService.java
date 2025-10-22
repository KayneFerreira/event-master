package com.project.event_master.security.auth;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.project.event_master.domain.repositories.UserRepository;
import com.project.event_master.dtos.user.UserResponseDTO;
import com.project.event_master.mappers.UserMapper;

@Service
public class AuthorizationService implements UserDetailsService {
	
	private final UserRepository repository;
	
	private final UserMapper mapper;
	
	public AuthorizationService(UserRepository repository, UserMapper mapper) {
		this.repository = repository;
		this.mapper = mapper;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserResponseDTO user = mapper.toDto(repository.findByUsername(username)
				.orElseThrow(() -> new UsernameNotFoundException("Usuário não encontrado: " + username)));
		return new UserDetailsImpl(user);
	}

}
