package com.project.event_master.application.usecases.event;

import com.project.event_master.dtos.event.UpdateEventDTO;

public class UpdateEventInput {

    private final Long id;
    private final UpdateEventDTO dto;

    public UpdateEventInput(Long id, UpdateEventDTO dto) {
        this.id = id;
        this.dto = dto;
    }

    public Long getId() {
        return id;
    }

    public UpdateEventDTO getDto() {
        return dto;
    }

}
