package com.project.event_master.exceptions;

public class UsernameAvailableException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public UsernameAvailableException(String username) {
    	super("Nome de usuário não está disponível. Username: " + username);
    }
}
