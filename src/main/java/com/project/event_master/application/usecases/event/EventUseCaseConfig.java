package com.project.event_master.application.usecases.event;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.project.event_master.application.services.EventService;
import com.project.event_master.mappers.EventMapper;

@Configuration
public class EventUseCaseConfig {

    @Bean
    CreateEventUseCase createEventUseCase(EventService service, EventMapper mapper) {
        return new CreateEventUseCase(service, mapper);
    }

    @Bean
    FindAllEventsUseCase findAllEventsUseCase(EventService service, EventMapper mapper) {
        return new FindAllEventsUseCase(service, mapper);
    }

    @Bean
    FindEventByIdUseCase findEventByIdUseCase(EventService service, EventMapper mapper) {
        return new FindEventByIdUseCase(service, mapper);
    }

    @Bean
    UpdateEventUseCase updateEventUseCase(EventService service, EventMapper mapper) {
        return new UpdateEventUseCase(service, mapper);
    }

    @Bean
    DeleteEventUseCase deleteEventUseCase(EventService service) {
        return new DeleteEventUseCase(service);
    }

}
