package com.project.event_master.application.usecases.comment;

import com.project.event_master.dtos.comment.UpdateCommentDTO;

public class UpdateCommentInput {
	
	private final UpdateCommentDTO dto;
	private final Long eventId;
	private final Long commentId;
	private final Long userId;
	
	public UpdateCommentInput(UpdateCommentDTO dto, Long eventId, Long commentId, Long userId) {
		this.dto = dto;
		this.eventId = eventId;
		this.commentId = commentId;
		this.userId = userId;
	}

	public UpdateCommentDTO getDto() {
		return dto;
	}

	public Long getEventId() {
		return eventId;
	}

	public Long getCommentId() {
		return commentId;
	}

	public Long getUserId() {
		return userId;
	}
	
}
