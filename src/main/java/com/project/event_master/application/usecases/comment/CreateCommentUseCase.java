package com.project.event_master.application.usecases.comment;

import com.project.event_master.application.services.CommentService;
import com.project.event_master.application.services.EventService;
import com.project.event_master.application.services.UserService;
import com.project.event_master.application.usecases.UseCase;
import com.project.event_master.domain.entities.CommentEntity;
import com.project.event_master.dtos.comment.CommentResponseDTO;
import com.project.event_master.mappers.CommentMapper;

public class CreateCommentUseCase implements UseCase<CreateCommentInput, CommentResponseDTO> {

	private final CommentService commentService;
	private final UserService userService;
    private final EventService eventService;
    private final CommentMapper mapper;
    
    public CreateCommentUseCase(CommentService commentService,
    							UserService userService,
    							EventService eventService,
    							CommentMapper mapper) {
        this.commentService = commentService;
        this.userService = userService;
        this.eventService = eventService;
        this.mapper = mapper;
    }

    public CommentResponseDTO execute(CreateCommentInput commentData) {
    	long eventId = commentData.getEventId();
    	long userId = commentData.getUserId();
        
        CommentEntity newComment = mapper.toEntity(commentData.getDto());
        newComment.setEvent(eventService.findEventById(eventId));
        newComment.setAuthor(userService.findUserById(userId));
        newComment.setText(newComment.getText());
        newComment.setCreatedAt();
        
        return mapper.toDto(commentService.createNewComment(newComment));
    }

}
