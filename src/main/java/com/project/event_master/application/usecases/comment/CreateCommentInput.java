package com.project.event_master.application.usecases.comment;

import com.project.event_master.dtos.comment.CreateCommentDTO;

public class CreateCommentInput {

    private final CreateCommentDTO dto;
    private final Long userId;
    private final Long eventId;

    public CreateCommentInput(CreateCommentDTO dto, Long userId, Long eventId) {
        this.dto = dto;
        this.userId = userId;
        this.eventId = eventId;
    }

    public CreateCommentDTO getDto() {
        return dto;
    }

    public Long getUserId() {
        return userId;
    }
    
    public Long getEventId() {
        return eventId;
    }

}
