package com.project.event_master.dtos.event;

import com.project.event_master.dtos.address.AddressResponseDTO;

public record AllEventsResponseDTO (
	    Long id,
	    String title,
	    AddressResponseDTO eventAddress,
	    EventAuthorDTO eventAuthor) {}

	/*
	    TODO:
	        [ ] Fill attributes
	*/
