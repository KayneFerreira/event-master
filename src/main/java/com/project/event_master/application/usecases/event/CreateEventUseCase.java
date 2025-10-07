package com.project.event_master.application.usecases.event;

import com.project.event_master.application.services.EventService;
import com.project.event_master.application.usecases.UseCase;
import com.project.event_master.domain.entities.EventEntity;
import com.project.event_master.dtos.event.CreateEventDTO;
import com.project.event_master.dtos.event.EventResponseDTO;
import com.project.event_master.mappers.EventMapper;

public class CreateEventUseCase implements UseCase<CreateEventDTO, EventResponseDTO> {

    private final EventService service;
    private final EventMapper mapper;

    public CreateEventUseCase(EventService service, EventMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    public EventResponseDTO execute(CreateEventDTO dto) {
        EventEntity newEvent = mapper.toEntity(dto);
        return mapper.toDto(service.createNewEvent(newEvent));
    }

}
