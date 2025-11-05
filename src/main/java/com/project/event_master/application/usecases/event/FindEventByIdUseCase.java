package com.project.event_master.application.usecases.event;

import com.project.event_master.application.services.EventService;
import com.project.event_master.application.usecases.UseCase;
import com.project.event_master.dtos.event.SingleEventResponseDTO;
import com.project.event_master.mappers.EventMapper;

public class FindEventByIdUseCase implements UseCase<Long, SingleEventResponseDTO> {

    private final EventService service;
    private final EventMapper mapper;

    public FindEventByIdUseCase(EventService service, EventMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    public SingleEventResponseDTO execute(Long id) {
        return mapper.toSingleEventDto(service.findEventById(id));
    }
    
}
