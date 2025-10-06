package com.project.event_master.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.event_master.application.services.EventService;
import com.project.event_master.dtos.event.CreateEventDTO;
import com.project.event_master.dtos.event.EventResponseDTO;
import com.project.event_master.dtos.event.UpdateEventDTO;

@RestController
@RequestMapping("/api/test/events")
public class EventController {

    // DEPENDENCY INJECTION
    private EventService service;

    private EventController(EventService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<EventResponseDTO> createNewEvent(@RequestBody CreateEventDTO event) {
        EventResponseDTO response = service.createNewEvent(event);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping
    public ResponseEntity<List<EventResponseDTO>> findAllEvents() {
        List<EventResponseDTO> response = service.findAllEvents();
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

    @GetMapping("/{id}")
    public ResponseEntity<EventResponseDTO> findEventById(@PathVariable Long id) {
        EventResponseDTO response = service.findEventById(id);
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

    @PutMapping("/{id}")
    public ResponseEntity<EventResponseDTO> updateEvent(@RequestBody UpdateEventDTO event, 
                                                        @PathVariable Long id) {
        EventResponseDTO response = service.updateEvent(event, id);
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEvent(@PathVariable Long id) {
        service.deleteEvent(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
