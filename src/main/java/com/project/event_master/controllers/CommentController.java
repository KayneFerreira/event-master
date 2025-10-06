package com.project.event_master.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.event_master.application.services.CommentService;
import com.project.event_master.dtos.comment.CommentResponseDTO;
import com.project.event_master.dtos.comment.CreateCommentDTO;
import com.project.event_master.dtos.comment.UpdateCommentDTO;

@RestController
@RequestMapping("/api/users/{userId}/events/{eventId}/comments")
public class CommentController {

    // DEPENDENCY INJECTION
    private CommentService service;

    private CommentController(CommentService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<CommentResponseDTO> createNewComment(@RequestBody CreateCommentDTO comment, 
                                          @PathVariable Long userId, 
                                          @PathVariable Long eventId) {
        CommentResponseDTO response = service.createNewComment(comment, userId, eventId);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping
    public ResponseEntity<List<CommentResponseDTO>> findAllComments(@PathVariable Long eventId) {
        List<CommentResponseDTO> response = service.findAllCommentsByEventId(eventId);
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

    @GetMapping("/{commentId}")
    public ResponseEntity<CommentResponseDTO> findCommentById(@PathVariable Long commentId) {
        CommentResponseDTO response = service.findCommentById(commentId);
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

    @PutMapping("/{commentId}")
    public ResponseEntity<CommentResponseDTO> updateComment(@RequestBody UpdateCommentDTO comment, 
                                                            @PathVariable Long commentId,
                                                            @PathVariable Long userId,
                                                            @PathVariable Long eventId) {
        CommentResponseDTO response = service.updateComment(comment, commentId, userId, eventId);
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

    @DeleteMapping("/{commentId}")
    public ResponseEntity<Void> deleteComment(@PathVariable Long commentId) {
        service.deleteComment(commentId);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

}
