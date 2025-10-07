package com.project.event_master.application.usecases.event;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.project.event_master.application.services.EventService;
import com.project.event_master.mappers.EventMapper;

@Configuration
public class EventUseCaseConfig {

    @Bean
    public CreateEventUseCase createEventUseCase(EventService service, EventMapper mapper) {
        return new CreateEventUseCase(service, mapper);
    }

    @Bean
    public FindAllEventsUseCase findAllEventsUseCase(EventService service, EventMapper mapper) {
        return new FindAllEventsUseCase(service, mapper);
    }

    @Bean
    public FindEventByIdUseCase findEventByIdUseCase(EventService service, EventMapper mapper) {
        return new FindEventByIdUseCase(service, mapper);
    }

    @Bean
    public UpdateEventUseCase updateEventUseCase(EventService service, EventMapper mapper) {
        return new UpdateEventUseCase(service, mapper);
    }

    @Bean
    public DeleteEventUseCase deleteEventUseCase(EventService service) {
        return new DeleteEventUseCase(service);
    }

}
