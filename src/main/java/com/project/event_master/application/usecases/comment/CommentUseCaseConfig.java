package com.project.event_master.application.usecases.comment;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.project.event_master.application.services.CommentService;
import com.project.event_master.application.services.EventService;
import com.project.event_master.application.services.UserService;
import com.project.event_master.mappers.CommentMapper;

@Configuration
public class CommentUseCaseConfig {

    @Bean
    CreateCommentUseCase createCommentUseCase(CommentService commentService,
    												UserService userService,
    												EventService eventService,
    												CommentMapper mapper) {
        return new CreateCommentUseCase(commentService, userService, eventService, mapper);
    }
    
    @Bean
    FindAllCommentsByEventUseCase findAllCommentsByEvent(CommentService service, CommentMapper mapper) {
    	return new FindAllCommentsByEventUseCase(service, mapper);
    }
    
    @Bean
    FindCommentByIdUseCase findCommentByIdUseCase(CommentService service, CommentMapper mapper) {
    	return new FindCommentByIdUseCase(service, mapper);
    }
    
    @Bean
    UpdateCommentUseCase updateCommentUseCase(CommentService commentService,
    											UserService userService,
    											EventService eventService,
    											CommentMapper mapper) {
        return new UpdateCommentUseCase(commentService, userService, eventService, mapper);
    }
    
    @Bean
    DeleteCommentUseCase deleteCommentUseCase(CommentService service) {
    	return new DeleteCommentUseCase(service);
    }

}
