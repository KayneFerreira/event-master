package com.project.event_master.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.project.event_master.dtos.event.CreateEventDTO;
import com.project.event_master.dtos.event.EventResponseDTO;
import com.project.event_master.dtos.event.UpdateEventDTO;
import com.project.event_master.services.EventService;

@RestController
@RequestMapping("/api/test/events")
public class EventController {

    // DEPENDENCY INJECTION
    private EventService service;

    private EventController(EventService service) {
        this.service = service;
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public EventResponseDTO createNewEvent(@RequestBody CreateEventDTO event) {
        return service.createNewEvent(event);
    }

    @GetMapping
    @ResponseBody
    @ResponseStatus(code = HttpStatus.OK)
    public List<EventResponseDTO> findAllEvents() {
        return service.findAllEvents();
    }

    @GetMapping("/{id}")
    @ResponseBody
    @ResponseStatus(code = HttpStatus.OK)
    public EventResponseDTO findEventById(@PathVariable Long id) {
        return service.findEventById(id);
    }

    @PutMapping("/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public EventResponseDTO updateEvent(@RequestBody UpdateEventDTO event, @PathVariable Long id) {
        return service.updateEvent(event, id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void deleteEvent(@PathVariable Long id) {
        service.deleteEvent(id);
    }
}
