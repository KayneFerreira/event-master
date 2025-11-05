package com.project.event_master.application.usecases.comment;

import com.project.event_master.dtos.comment.UpdateCommentDTO;

public class UpdateCommentInput {
	
	private final UpdateCommentDTO dto;
	private final Long eventId;
	private final Long commentId;
	
	public UpdateCommentInput(UpdateCommentDTO dto, Long eventId, Long commentId) {
		this.dto = dto;
		this.eventId = eventId;
		this.commentId = commentId;
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

}
