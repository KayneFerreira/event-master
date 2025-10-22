package com.project.event_master.exceptions;

import com.auth0.jwt.exceptions.JWTCreationException;

public class GenerateTokenException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public GenerateTokenException(JWTCreationException exception) {
		super("Não foi possível gerar um token para a sessão. /nException: /n" + exception);
	}
	
}
