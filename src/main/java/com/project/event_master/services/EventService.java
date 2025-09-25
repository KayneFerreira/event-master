package com.project.event_master.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.event_master.entities.EventEntity;
import com.project.event_master.repositories.EventRepository;
import com.project.event_master.services.exceptions.RecordNotFoundException;

@Service
public class EventService {

    // DEPENDENCY INJECTION 
    private EventRepository repository;

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

    public EventEntity updateEvent(EventEntity event, Long id) {
        return repository.findById(id)
            .map(updateEvent -> {
                updateEvent.setTitle(event.getTitle());
                updateEvent.setAddress(event.getAddress());
                return repository.save(updateEvent);
            }
        ).orElseThrow(() -> new RecordNotFoundException("Evento", id));
    }

    public void deleteEvent(Long id) {
        repository.delete(findEventById(id));
    }

}
