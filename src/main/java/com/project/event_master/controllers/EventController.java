package com.project.event_master.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.project.event_master.entities.EventEntity;
import com.project.event_master.services.EventService;

@RestController
@RequestMapping("/api/test/events")
public class EventController {

    // DEPENDENCY INJECTION
    private EventService service;

    private EventController(EventService service) {
        this.service = service;
    }

    /* Create new event */
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public EventEntity createNewEvent(@RequestBody EventEntity event) {
        return service.createNewEvent(event);
    }

    /* List all existing events */
    @GetMapping
    @ResponseBody
    @ResponseStatus(code = HttpStatus.OK)
    public List<EventEntity> findAllEvents() {
        return service.findAllEvents();
    }
}
