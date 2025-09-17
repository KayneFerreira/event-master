package com.project.event_master.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.event_master.entities.EventEntity;
import com.project.event_master.repositories.EventRepository;

@Service
public class EventService {

    // DEPENDENCY INJECTION
    private EventRepository repository;

    private EventService(EventRepository repository) {
        this.repository = repository;
    }

    /* Create new event */
    public EventEntity createNewEvent(EventEntity event) {
        return repository.save(event);
    }

    /* List all existing events */
    public List<EventEntity> findAllEvents() {
        return repository.findAll();
    }

}
