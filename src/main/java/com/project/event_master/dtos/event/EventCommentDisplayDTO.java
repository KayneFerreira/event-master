package com.project.event_master.dtos.event;

import java.time.Instant;

import com.project.event_master.dtos.comment.CommentAuthorDTO;

public record EventCommentDisplayDTO (
	    Long id,
	    String text,
	    CommentAuthorDTO commentAuthor,
	    Instant createdAt,
	    Instant editedAt) {}

	/*
	    TODO:
	        [ ] Fill attributes
	*/