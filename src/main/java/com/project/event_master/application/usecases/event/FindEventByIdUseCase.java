package com.project.event_master.application.usecases.event;

import com.project.event_master.application.services.EventService;
import com.project.event_master.application.usecases.UseCase;
import com.project.event_master.dtos.event.EventResponseDTO;
import com.project.event_master.mappers.EventMapper;

public class FindEventByIdUseCase implements UseCase<Long, EventResponseDTO> {

    private final EventService service;
    private final EventMapper mapper;

    public FindEventByIdUseCase(EventService service, EventMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    public EventResponseDTO execute(Long id) {
        return mapper.toDto(service.findEventById(id));
    }
    
}
