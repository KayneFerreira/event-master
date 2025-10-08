package com.project.event_master.application.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.event_master.domain.entities.CommentEntity;
import com.project.event_master.domain.repositories.CommentRepository;
import com.project.event_master.exceptions.RecordNotFoundException;

@Service
public class CommentService {

    private final CommentRepository repository;

    private CommentService(CommentRepository repository) {
        this.repository = repository;
    }

    public CommentEntity createNewComment(CommentEntity newComment) {
        return repository.save(newComment);
    }

    public List<CommentEntity> findAllCommentsByEventId(Long eventId) {
        return repository.findByEventId(eventId);
    }

    public CommentEntity findCommentById(Long commentId) {
        return repository.findById(commentId)
            .orElseThrow(() -> new RecordNotFoundException("Comentário", commentId));
    }

    public CommentEntity updateComment(CommentEntity updatedComment) {
    	return repository.save(updatedComment);
    }

    public void deleteComment(Long id) {
        if (!repository.existsById(id)) {
            throw new RecordNotFoundException("Comentário", id);
        }
        repository.deleteById(id);
    }

}
