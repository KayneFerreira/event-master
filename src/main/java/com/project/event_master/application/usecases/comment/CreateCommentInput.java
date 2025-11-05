package com.project.event_master.application.usecases.comment;

import com.project.event_master.dtos.comment.CreateCommentDTO;

public class CreateCommentInput {

    private final CreateCommentDTO dto;
    private final Long eventId;

    public CreateCommentInput(CreateCommentDTO dto, Long eventId) {
        this.dto = dto;
        this.eventId = eventId;
    }

    public CreateCommentDTO getDto() {
        return dto;
    }

    public Long getEventId() {
        return eventId;
    }

}
