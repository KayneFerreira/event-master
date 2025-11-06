package com.project.event_master.application.usecases.comment;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import com.project.event_master.application.services.CommentService;
import com.project.event_master.application.services.EventService;
import com.project.event_master.application.services.UserService;
import com.project.event_master.application.usecases.UseCase;
import com.project.event_master.domain.entities.CommentEntity;
import com.project.event_master.dtos.comment.CommentResponseDTO;
import com.project.event_master.mappers.CommentMapper;
import com.project.event_master.security.auth.UserDetailsImpl;

public class UpdateCommentUseCase implements UseCase<UpdateCommentInput, CommentResponseDTO>{

	private final CommentService commentService;
	private final UserService userService;
    private final EventService eventService;
    private final CommentMapper commentMapper;
    
    public UpdateCommentUseCase(CommentService commentService,
    							UserService userService,
    							EventService eventService,
    							CommentMapper commentMapper) {
        this.commentService = commentService;
        this.userService = userService;
        this.eventService = eventService;
        this.commentMapper = commentMapper;
    }
    
    public CommentResponseDTO execute(UpdateCommentInput commentData) {
    	Authentication auth = SecurityContextHolder.getContext().getAuthentication();
    	
    	if(auth.getPrincipal() instanceof UserDetailsImpl userDetails) {
    		long userId = userDetails.getUser().getId();
    		long eventId = commentData.getEventId();
    		long commentId = commentData.getCommentId();
    		CommentEntity commentToUpdate = commentService.findCommentById(commentId);
    		String newText = commentData.getDto().getText();
    		
    		commentToUpdate = buildUpdateComment(commentToUpdate, newText, eventId, userId);
    		return commentMapper.toDto(commentService.updateComment(commentToUpdate, commentId));
    		
    	} else {
    		throw new IllegalStateException("Usuário autenticado não é do tipo esperado.");
    	}
    }
    
    public CommentEntity buildUpdateComment(CommentEntity commentToUpdate, 
    										String newText, long eventId, long userId) {
        commentToUpdate.setCommentEvent(eventService.findEventById(eventId));
        commentToUpdate.setCommentAuthor(userService.findUserById(userId));
        commentToUpdate.setText(newText);
        commentToUpdate.setEditedAt();
    	return commentToUpdate;
    }
    
}
