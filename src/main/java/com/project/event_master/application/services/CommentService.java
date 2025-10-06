package com.project.event_master.application.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.event_master.domain.entities.CommentEntity;
import com.project.event_master.domain.repositories.CommentRepository;
import com.project.event_master.domain.repositories.EventRepository;
import com.project.event_master.domain.repositories.UserRepository;
import com.project.event_master.dtos.comment.CommentResponseDTO;
import com.project.event_master.dtos.comment.CreateCommentDTO;
import com.project.event_master.dtos.comment.UpdateCommentDTO;
import com.project.event_master.exceptions.RecordNotFoundException;
import com.project.event_master.mappers.CommentMapper;

@Service
public class CommentService {

    //DEPENDENCY INJECTION
    private CommentRepository commentRepository;
    private UserRepository userRepository;
    private EventRepository eventRepository;
    private CommentMapper mapper;

    private CommentService(CommentRepository repository, 
                            UserRepository userRepository, 
                            EventRepository eventRepository,
                            CommentMapper mapper) {
        this.commentRepository = repository;
        this.userRepository = userRepository;
        this.eventRepository = eventRepository;
        this.mapper = mapper;
    }

    public CommentResponseDTO createNewComment(CreateCommentDTO comment, Long userId, Long eventId) {
        return userRepository.findById(userId)
            .map(user -> {
                return eventRepository.findById(eventId)
                    .map(event -> {
                        CommentEntity newComment = new CommentEntity();
                        newComment.setText(comment.getText());
                        newComment.setAuthor(user);
                        newComment.setEvent(event);
                        newComment.setCreatedAt();
                        return mapper.toDto(commentRepository.save(newComment));
                        }
                    ).orElseThrow(() -> new RecordNotFoundException("Evento", eventId));
                }
            ).orElseThrow(() -> new RecordNotFoundException("Usuário", userId));
    }

    public List<CommentResponseDTO> findAllCommentsByEventId(Long eventId) {
        return mapper.toDtoList(commentRepository.findByEventId(eventId));
    }

    public CommentResponseDTO findCommentById(Long id) {
        return mapper.toDto(commentRepository.findById(id)
            .orElseThrow(() -> new RecordNotFoundException("Comentário", id)));
    }

    public CommentResponseDTO updateComment(UpdateCommentDTO comment, Long commentId, Long userId, Long eventId) {
        return userRepository.findById(userId)
            .map(user -> {
                return eventRepository.findById(eventId)
                    .map(event -> {
                        return commentRepository.findById(commentId)
                            .map(commentToUpdate -> {
                                CommentEntity newComment = new CommentEntity();
                                newComment.setText(comment.getText());
                                newComment.setAuthor(user);
                                newComment.setEvent(event);
                                newComment.setEditedAt();
                                return mapper.toDto(commentRepository.save(newComment));
                            }
                        ).orElseThrow(() -> new RecordNotFoundException("Comentário", commentId));
                    }
                ).orElseThrow(() -> new RecordNotFoundException("Evento", eventId));
            }
        ).orElseThrow(() -> new RecordNotFoundException("Usuário", userId));
    }

    public void deleteComment(Long id) {
        if (!commentRepository.existsById(id)) {
            throw new RecordNotFoundException("Comentário", id);
        }
        commentRepository.deleteById(id);
    }

}
