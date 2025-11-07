package com.project.event_master.dtos.user;

import java.time.LocalDate;

import com.project.event_master.domain.enums.UserRoles;
import com.project.event_master.dtos.address.AddressResponseDTO;

public record UserResponseDTO (
	    LocalDate birthDate,
	    String name,
	    Long id,
	    String cpf,
	    String username,	// WARN: REMOVE AFTER TEST
	    String password,	// WARN: REMOVE AFTER TEST
	    UserRoles role,
		AddressResponseDTO userAddress
		) {}

    /*
        TODO:
            [ ] Fill attributes
    */
