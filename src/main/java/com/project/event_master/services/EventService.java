package com.project.event_master.services;

import java.util.List;
import java.util.Optional;

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

    /** Create new event */
    public EventEntity createNewEvent(EventEntity event) {
        return repository.save(event);
    }

    /** List all existing events */
    public List<EventEntity> findAllEvents() {
        return repository.findAll();
    }

    // CHANGE -> MUST THROW EXCEPTION (CREATE CUSTOM EXCEPTION)
    /** Find event by id */
    public Optional<EventEntity> findEventById(Long id) {
        return repository.findById(id);
    }

    // WARN: MAY NEED CHANGES
    /** Update existing event */
    public EventEntity updateEvent(EventEntity event, Long id) {
        EventEntity updateEvent = repository.findById(id).get();
        updateEvent.setTitle(event.getTitle());
        updateEvent.setAddress(event.getAddress());
        return repository.save(updateEvent);
    }

    // CHANGE -> MUST THROW EXCEPTION (CREATE CUSTOM EXCEPTION)
    /** Delete existing event by id */
    public void deleteEvent(Long id) {
        repository.deleteById(id);
    }

}
