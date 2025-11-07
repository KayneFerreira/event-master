package com.project.event_master.dtos.comment;

import java.time.Instant;

public record CommentResponseDTO (
	    Long id,
	    String text,
	    CommentAuthorDTO commentAuthor,
	    CommentEventDTO commentEvent,
	    Instant createdAt,
	    Instant editedAt) {}


	/*
	    TODO:
	        [ ] Fill attributes
	*/