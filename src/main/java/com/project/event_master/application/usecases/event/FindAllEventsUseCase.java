package com.project.event_master.application.usecases.event;

import java.util.List;
import java.util.stream.Collectors;

import com.project.event_master.application.services.EventService;
import com.project.event_master.application.usecases.UseCase;
import com.project.event_master.dtos.event.EventResponseDTO;
import com.project.event_master.mappers.EventMapper;

public class FindAllEventsUseCase implements UseCase<Void, List<EventResponseDTO>> {

    private final EventService service;
    private final EventMapper mapper;

    public FindAllEventsUseCase(EventService service, EventMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    public List<EventResponseDTO> execute(Void input) {
        return service.findAllEvents()
                        .stream()
                        .map(event -> mapper.toDto(event))
                        .collect(Collectors.toList());
    }
    
}
