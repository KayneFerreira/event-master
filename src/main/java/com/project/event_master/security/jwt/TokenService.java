package com.project.event_master.security.jwt;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

import org.springframework.stereotype.Service;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.project.event_master.dtos.user.AuthenticateUserDTO;
import com.project.event_master.exceptions.GenerateTokenException;

@Service
public class TokenService {
	
	/**
	 * WARN: Valor temporário inserida em "application.properties".
	 * Deve ser devidamente configurada como variável de ambiente.
	 * DESATIVADO TEMPORARIAMENTE
	 */
//	@Value("${api.security.token.secret}")
	private String secret = "temp-auth-secret";
	
	public String generateToken(AuthenticateUserDTO user) {
		try {
			Algorithm algorithm = Algorithm.HMAC256(secret);
			String token = JWT.create()
					.withIssuer("auth-api")
					.withSubject(user.getUsername())
					.withExpiresAt(generateExpirationDate())
					.sign(algorithm);
			return token;
		} catch (JWTCreationException exception) {
			throw new GenerateTokenException(exception);
		}
	}
	
	public String validateToken(String token) {
		try {
			Algorithm algorithm = Algorithm.HMAC256(secret);
			return JWT.require(algorithm)
					.withIssuer("auth-api")
					.build()
					.verify(token)
					.getSubject();
		} catch (JWTCreationException exception) {
			return " ";
		}
	}
	
	private Instant generateExpirationDate() {
		return LocalDateTime.now().plusHours(2).toInstant(ZoneOffset.of("-03:00"));
	}
}
