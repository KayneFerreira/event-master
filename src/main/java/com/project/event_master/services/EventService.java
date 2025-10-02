package com.project.event_master.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.project.event_master.domain.EventEntity;
import com.project.event_master.dtos.event.CreateEventDTO;
import com.project.event_master.dtos.event.EventResponseDTO;
import com.project.event_master.dtos.event.UpdateEventDTO;
import com.project.event_master.exceptions.RecordNotFoundException;
import com.project.event_master.mappers.EventMapper;
import com.project.event_master.repositories.EventRepository;

@Service
public class EventService {

    // DEPENDENCY INJECTION 
    private EventRepository repository;
    private EventMapper mapper;

    private EventService(EventRepository repository, EventMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public EventResponseDTO createNewEvent(CreateEventDTO event) {
        EventEntity newEvent = mapper.toEntity(event);
        return mapper.toDto(repository.save(newEvent));
    }

    public List<EventResponseDTO> findAllEvents() {
        return repository.findAll().stream()
            .map(event -> mapper.toDto(event))
            .collect(Collectors.toList());
    }

    public EventResponseDTO findEventById(Long id) {
        return mapper.toDto(repository.findById(id)
            .orElseThrow(() -> new RecordNotFoundException("Evento", id)));
    }

    public EventResponseDTO updateEvent(UpdateEventDTO event, Long id) {
        EventEntity eventToUpdate = repository.findById(id)
            .orElseThrow(() -> new RecordNotFoundException("Evento", id));
        mapper.updateEntityFromDto(event, eventToUpdate);
        return mapper.toDto(repository.save(eventToUpdate));
    }

    public void deleteEvent(Long id) {
        if (!repository.existsById(id)) {
            throw new RecordNotFoundException("Evento", id);
        }
        repository.deleteById(id);
    }

}
