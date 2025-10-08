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

import com.project.event_master.application.usecases.event.CreateEventUseCase;
import com.project.event_master.application.usecases.event.DeleteEventUseCase;
import com.project.event_master.application.usecases.event.FindAllEventsUseCase;
import com.project.event_master.application.usecases.event.FindEventByIdUseCase;
import com.project.event_master.application.usecases.event.UpdateEventInput;
import com.project.event_master.application.usecases.event.UpdateEventUseCase;
import com.project.event_master.dtos.event.CreateEventDTO;
import com.project.event_master.dtos.event.EventResponseDTO;
import com.project.event_master.dtos.event.UpdateEventDTO;

@RestController
@RequestMapping("/api/test/events")
public class EventController {

    private final CreateEventUseCase createNewEvent;
    private final FindAllEventsUseCase findAllEvents;
    private final FindEventByIdUseCase findEventById;
    private final UpdateEventUseCase updateEvent;
    private final DeleteEventUseCase deleteEvent;

    private EventController(
                    CreateEventUseCase createNewEvent,
                    FindAllEventsUseCase findAllEvents,
                    FindEventByIdUseCase findEventById,
                    UpdateEventUseCase updateEvent,
                    DeleteEventUseCase deleteEvent
                    ) {
        this.createNewEvent = createNewEvent;
        this.findAllEvents = findAllEvents;
        this.findEventById = findEventById;
        this.updateEvent = updateEvent;
        this.deleteEvent = deleteEvent;
    }

    @PostMapping
    public ResponseEntity<EventResponseDTO> createNewEvent(@RequestBody CreateEventDTO event) {
        EventResponseDTO response = createNewEvent.execute(event);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping
    public ResponseEntity<List<EventResponseDTO>> findAllEvents() {
        List<EventResponseDTO> response = findAllEvents.execute(null);
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

    @GetMapping("/{id}")
    public ResponseEntity<EventResponseDTO> findEventById(@PathVariable Long id) {
        EventResponseDTO response = findEventById.execute(id);
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

    @PutMapping("/{id}")
    public ResponseEntity<EventResponseDTO> updateEvent(@RequestBody UpdateEventDTO event, 
                                                        @PathVariable Long id) {
        UpdateEventInput eventInput = new UpdateEventInput(id, event);
        EventResponseDTO response = updateEvent.execute(eventInput);
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEvent(@PathVariable Long id) {
        deleteEvent.execute(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
