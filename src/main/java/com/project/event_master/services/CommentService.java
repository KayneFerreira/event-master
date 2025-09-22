package com.project.event_master.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.event_master.entities.CommentEntity;
import com.project.event_master.repositories.CommentRepository;
import com.project.event_master.repositories.EventRepository;
import com.project.event_master.repositories.UserRepository;
import com.project.event_master.services.exceptions.RecordNotFoundException;

@Service
public class CommentService {

    //DEPENDENCY INJECTION
    private CommentRepository commentRepository;
    private UserRepository userRepository;
    private EventRepository eventRepository;

    private CommentService(CommentRepository repository, 
                            UserRepository userRepository, 
                            EventRepository eventRepository) {
        this.commentRepository = repository;
        this.userRepository = userRepository;
        this.eventRepository = eventRepository;
    }

    public CommentEntity createNewComment(CommentEntity comment, Long userId, Long eventId) {
        return userRepository.findById(userId)
            .map(user -> {
                return eventRepository.findById(eventId)
                    .map(event -> {
                        comment.setAuthor(user);
                        comment.setEvent(event);
                        comment.setCreatedAt();
                        return commentRepository.save(comment);
                        }
                    ).orElseThrow(() -> new RecordNotFoundException(eventId));
                }
            ).orElseThrow(() -> new RecordNotFoundException(userId));
    }

    public List<CommentEntity> findAllCommentsByEventId(Long eventId) {
        return commentRepository.findByEventId(eventId);
    }

    public CommentEntity findCommentById(Long id) {
        return commentRepository.findById(id)
            .orElseThrow(() -> new RecordNotFoundException(id));
    }

    public CommentEntity updateComment(CommentEntity comment, Long commentId, Long userId, Long eventId) {
        return userRepository.findById(userId)
            .map(user -> {
                return eventRepository.findById(eventId)
                    .map(event -> {
                        return commentRepository.findById(commentId)
                            .map(updateComment -> {
                                updateComment.setText(comment.getText());
                                updateComment.setAuthor(user);
                                updateComment.setEvent(event);
                                updateComment.setEditedAt();
                                return commentRepository.save(updateComment);
                            }
                        ).orElseThrow(() -> new RecordNotFoundException(commentId));
                    }
                ).orElseThrow(() -> new RecordNotFoundException(eventId));
            }
        ).orElseThrow(() -> new RecordNotFoundException(userId));
    }

    public void deleteComment(Long id) {
        commentRepository.delete(findCommentById(id));
    }

}
