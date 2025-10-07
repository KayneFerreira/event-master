package com.project.event_master.application.usecases.user;

import com.project.event_master.dtos.user.UpdateUserDTO;

public class UpdateUserInput {

    private final Long id;
    private final UpdateUserDTO dto;

    public UpdateUserInput(Long id, UpdateUserDTO dto) {
        this.id = id;
        this.dto = dto;
    }

    // GETTERS
    public Long getId() {
        return id;
    }

    public UpdateUserDTO getDto() {
        return dto;
    }
    
}
