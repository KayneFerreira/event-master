package com.project.event_master.application.usecases.event;

import java.util.List;
import java.util.stream.Collectors;

import com.project.event_master.application.services.EventService;
import com.project.event_master.application.usecases.UseCase;
import com.project.event_master.dtos.event.AllEventsResponseDTO;
import com.project.event_master.mappers.EventMapper;

public class FindAllEventsUseCase implements UseCase<Long, List<AllEventsResponseDTO>> {

    private final EventService eventService;
    private final EventMapper eventMapper;

    public FindAllEventsUseCase(EventService eventService, EventMapper eventMapper) {
        this.eventService = eventService;
        this.eventMapper = eventMapper;
    }

    public List<AllEventsResponseDTO> execute(Long eventId) {
    	return eventService.findAllEvents()
                        .stream()
                        .map(event -> eventMapper.toAllEventsDto(event))
                        .collect(Collectors.toList());
    }
    
}
