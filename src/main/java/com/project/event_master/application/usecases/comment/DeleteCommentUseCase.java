package com.project.event_master.application.usecases.comment;

import com.project.event_master.application.services.CommentService;
import com.project.event_master.application.usecases.UseCase;

public class DeleteCommentUseCase implements UseCase<Long, Void>{
	
	private final CommentService service;
	
	public DeleteCommentUseCase(CommentService service) {
		this.service = service;
	}
	
	public Void execute(Long id) {
		service.deleteComment(id);
		return null;
	}

}
