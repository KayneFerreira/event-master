package com.project.event_master.application.usecases.comment;

import com.project.event_master.application.services.CommentService;
import com.project.event_master.application.usecases.UseCase;
import com.project.event_master.dtos.comment.CommentResponseDTO;
import com.project.event_master.mappers.CommentMapper;

public class FindCommentByIdUseCase implements UseCase<Long, CommentResponseDTO> {

	private final CommentService service;
	private final CommentMapper mapper;
	
	public FindCommentByIdUseCase(CommentService service, CommentMapper mapper) {
		this.service = service;
		this.mapper = mapper;
	}
	
	public CommentResponseDTO execute(Long commentId) {
		return mapper.toDto(service.findCommentById(commentId));
	}
}
