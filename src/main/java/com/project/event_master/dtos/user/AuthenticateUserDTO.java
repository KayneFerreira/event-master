package com.project.event_master.dtos.user;

import com.project.event_master.domain.enums.UserRoles;

public record AuthenticateUserDTO (
		String username,
		String password,
		UserRoles role) {}

	/*
	    TODO:
	        [ ] Fill attributes
	*/