package com.project.event_master.dtos.event;

import java.util.List;

import com.project.event_master.dtos.address.AddressResponseDTO;

public record SingleEventResponseDTO (
		Long id,
	    String title,
	    AddressResponseDTO eventAddress,
	    EventAuthorDTO eventAuthor,
		List<EventCommentDisplayDTO> comments) {}


	/*
	    TODO:
	        [ ] Fill attributes
	*/