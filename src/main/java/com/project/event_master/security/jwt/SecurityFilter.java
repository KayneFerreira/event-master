package com.project.event_master.security.jwt;

import java.io.IOException;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import com.project.event_master.application.services.UserService;
import com.project.event_master.mappers.UserMapper;
import com.project.event_master.security.auth.UserDetailsImpl;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class SecurityFilter extends OncePerRequestFilter {
	
	private final TokenService tokenService;
	
	private final UserService userService;
	
	private final UserMapper mapper;
	
	public SecurityFilter(TokenService tokenService, UserService userService, UserMapper mapper) {
		this.tokenService = tokenService;
		this.userService = userService;
		this.mapper = mapper;
	}

	@Override
	protected void doFilterInternal(
			HttpServletRequest request, 
			HttpServletResponse response, 
			FilterChain filterChain)
			throws ServletException, IOException {
		
		String token = recoverToken(request);
		
		if(token != null) {
			var subject = tokenService.validateToken(token);
			UserDetailsImpl user = new UserDetailsImpl(
					mapper.toDto(userService.findUserByUsername(subject))); 
			var authentication = new UsernamePasswordAuthenticationToken(
					user, null, user.getAuthorities());
			SecurityContextHolder.getContext().setAuthentication(authentication);
		}
		filterChain.doFilter(request, response);
	}
	
	private String recoverToken(HttpServletRequest request) {
		String authHeader = request.getHeader("Authorization");
		if(authHeader == null) { 
			return null; 
		}
		return authHeader.replace("Bearer ", "");
	}

}
