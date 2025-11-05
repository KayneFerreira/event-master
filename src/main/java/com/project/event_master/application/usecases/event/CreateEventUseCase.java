package com.project.event_master.application.usecases.event;

import com.project.event_master.application.services.EventService;
import com.project.event_master.application.services.UserService;
import com.project.event_master.application.usecases.UseCase;
import com.project.event_master.domain.entities.EventEntity;
import com.project.event_master.domain.entities.UserEntity;
import com.project.event_master.dtos.event.AllEventsResponseDTO;
import com.project.event_master.dtos.event.CreateEventDTO;
import com.project.event_master.mappers.EventMapper;

public class CreateEventUseCase implements UseCase<CreateEventDTO, AllEventsResponseDTO> {

    private final EventService eventService;
    private final EventMapper mapper;
    private final UserService userService;

    public CreateEventUseCase(EventService eventService, EventMapper mapper, UserService userService) {
        this.eventService = eventService;
        this.mapper = mapper;
        this.userService = userService;
    }

    public AllEventsResponseDTO execute(CreateEventDTO dto) {
    	UserEntity author = userService.findUserById(dto.getEventAuthor().getId());
        EventEntity newEvent = mapper.toEntity(dto);
        newEvent.setEventAuthor(author);
        return mapper.toAllEventsDto(eventService.createNewEvent(newEvent));
    }

}
