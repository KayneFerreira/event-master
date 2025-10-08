package com.project.event_master.application.usecases.comment;

import com.project.event_master.application.services.CommentService;
import com.project.event_master.application.services.EventService;
import com.project.event_master.application.services.UserService;
import com.project.event_master.application.usecases.UseCase;
import com.project.event_master.domain.entities.CommentEntity;
import com.project.event_master.dtos.comment.CommentResponseDTO;
import com.project.event_master.mappers.CommentMapper;

public class UpdateCommentUseCase implements UseCase<UpdateCommentInput, CommentResponseDTO>{

	private final CommentService commentService;
	private final UserService userService;
    private final EventService eventService;
    private final CommentMapper mapper;
    
    public UpdateCommentUseCase(CommentService commentService,
    							UserService userService,
    							EventService eventService,
    							CommentMapper mapper) {
        this.commentService = commentService;
        this.userService = userService;
        this.eventService = eventService;
        this.mapper = mapper;
    }
    
    public CommentResponseDTO execute(UpdateCommentInput commentData) {
    	long userId = commentData.getUserId();
    	long eventId = commentData.getEventId();
    	long commentId = commentData.getCommentId();
    	
    	CommentEntity commentToUpdate = commentService.findCommentById(commentId);
    	
    	commentToUpdate.setAuthor(userService.findUserById(userId));
    	commentToUpdate.setEvent(eventService.findEventById(eventId));
    	commentToUpdate.setText(commentData.getDto().getText());
    	commentToUpdate.setEditedAt();
    	
    	return mapper.toDto(commentService.updateComment(commentToUpdate));
    }
}
