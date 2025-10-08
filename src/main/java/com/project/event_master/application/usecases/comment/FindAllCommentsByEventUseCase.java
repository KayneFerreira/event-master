package com.project.event_master.application.usecases.comment;

import java.util.List;

import com.project.event_master.application.services.CommentService;
import com.project.event_master.application.usecases.UseCase;
import com.project.event_master.domain.entities.CommentEntity;
import com.project.event_master.dtos.comment.CommentResponseDTO;
import com.project.event_master.mappers.CommentMapper;

public class FindAllCommentsByEventUseCase implements UseCase<Long, List<CommentResponseDTO>>{
	
	private final CommentService service;
	private final CommentMapper mapper;
	
	public FindAllCommentsByEventUseCase(CommentService service, CommentMapper mapper) {
		this.service = service;
		this.mapper = mapper;
	}
	
	public List<CommentResponseDTO> execute(Long eventId) {
		List<CommentEntity> comments = service.findAllCommentsByEventId(eventId);
		return mapper.toDtoList(comments);
	}

}
