package com.project.event_master.application.usecases.event;

import com.project.event_master.application.services.EventService;
import com.project.event_master.application.usecases.UseCase;

public class DeleteEventUseCase implements UseCase<Long, Void> {

    private final EventService service;

    public DeleteEventUseCase(EventService service) {
        this.service = service;
    }

    public Void execute(Long id) {
        service.deleteEvent(id);
        return null;
    }

}
