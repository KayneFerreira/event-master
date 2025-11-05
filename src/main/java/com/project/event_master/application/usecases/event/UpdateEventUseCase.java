package com.project.event_master.application.usecases.event;

import com.project.event_master.application.services.EventService;
import com.project.event_master.application.usecases.UseCase;
import com.project.event_master.domain.entities.EventEntity;
import com.project.event_master.dtos.event.SingleEventResponseDTO;
import com.project.event_master.dtos.event.UpdateEventDTO;
import com.project.event_master.mappers.EventMapper;

public class UpdateEventUseCase implements UseCase<UpdateEventInput, SingleEventResponseDTO> {

    private final EventService service;
    private final EventMapper mapper;

    public UpdateEventUseCase(EventService service, EventMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    public SingleEventResponseDTO execute(UpdateEventInput eventData) {
        UpdateEventDTO newEvent = eventData.getDto();
        EventEntity eventToUpdate = service.findEventById(eventData.getId());
        mapper.updateEntityFromDto(newEvent, eventToUpdate);
        return mapper.toSingleEventDto(service.updateEvent(eventToUpdate));
    }

}
