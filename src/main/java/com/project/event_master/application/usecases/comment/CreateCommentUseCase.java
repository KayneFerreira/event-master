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

public class CreateCommentUseCase implements UseCase<CreateCommentInput, CommentResponseDTO> {

	private final CommentService commentService;
	private final UserService userService;
    private final EventService eventService;
    private final CommentMapper commentMapper;
    
    public CreateCommentUseCase(CommentService commentService,
    							UserService userService,
    							EventService eventService,
    							CommentMapper commentMapper) {
        this.commentService = commentService;
        this.userService = userService;
        this.eventService = eventService;
        this.commentMapper = commentMapper;
    }

    public CommentResponseDTO execute(CreateCommentInput commentData) {
    	Authentication auth = SecurityContextHolder.getContext().getAuthentication();
    	
    	if(auth.getPrincipal() instanceof UserDetailsImpl userDetails) {
    		long userId = userDetails.getUser().id();
    		long eventId = commentData.getEventId();
    		CommentEntity newComment = commentMapper.toEntity(commentData.getDto());
    		
    		newComment = buildNewComment(newComment, eventId, userId);
    		return commentMapper.toDto(commentService.saveNewComment(newComment));
    		
    	} else {
    		throw new IllegalStateException("Usuário autenticado não é do tipo esperado.");
    	}
    }
    
    public CommentEntity buildNewComment(CommentEntity newComment, long eventId, long userId) {
        newComment.setCommentEvent(eventService.findEventById(eventId));
        newComment.setCommentAuthor(userService.findUserById(userId));
        newComment.setText(newComment.getText());
        newComment.setCreatedAt();
    	return newComment;
    }

}
