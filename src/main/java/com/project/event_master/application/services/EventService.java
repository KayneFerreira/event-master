package com.project.event_master.application.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.event_master.domain.entities.EventEntity;
import com.project.event_master.domain.repositories.EventRepository;
import com.project.event_master.exceptions.RecordNotFoundException;

@Service
public class EventService {

    private final EventRepository repository;

    private EventService(EventRepository repository) {
        this.repository = repository;
    }

    public EventEntity createNewEvent(EventEntity event) {
        return repository.save(event);
    }

    public List<EventEntity> findAllEvents() {
        return repository.findAll();
    }

    public EventEntity findEventById(Long id) {
        return repository.findById(id)
            .orElseThrow(() -> new RecordNotFoundException("Evento", id));
    }

    public EventEntity updateEvent(EventEntity event) {
        return repository.save(event);
    }

    public void deleteEvent(Long id) {
        if (!repository.existsById(id)) {
            throw new RecordNotFoundException("Evento", id);
        }
        repository.deleteById(id);
    }

}
