package com.project.event_master.application.usecases.event;

import com.project.event_master.application.services.EventService;
import com.project.event_master.application.usecases.UseCase;
import com.project.event_master.dtos.event.SingleEventResponseDTO;
import com.project.event_master.mappers.EventMapper;

public class FindEventByIdUseCase implements UseCase<Long, SingleEventResponseDTO> {

    private final EventService service;
    private final EventMapper eventMapper;

    public FindEventByIdUseCase(EventService service, EventMapper eventMapper) {
        this.service = service;
        this.eventMapper = eventMapper;
    }

    public SingleEventResponseDTO execute(Long id) {
    	return eventMapper.toSingleEventDto(service.findEventById(id));
    }
    
}
