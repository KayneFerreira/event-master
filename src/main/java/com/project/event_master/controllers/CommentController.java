package com.project.event_master.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.project.event_master.dtos.comment.CommentResponseDTO;
import com.project.event_master.dtos.comment.CreateCommentDTO;
import com.project.event_master.dtos.comment.UpdateCommentDTO;
import com.project.event_master.services.CommentService;

@RestController
@RequestMapping("/api/users/{userId}/events/{eventId}/comments")
public class CommentController {

    // DEPENDENCY INJECTION
    private CommentService service;

    private CommentController(CommentService service) {
        this.service = service;
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public CommentResponseDTO createNewComment(@RequestBody CreateCommentDTO comment, 
                                          @PathVariable Long userId, 
                                          @PathVariable Long eventId) {
        return service.createNewComment(comment, userId, eventId);
    }

    @GetMapping
    @ResponseBody
    @ResponseStatus(code = HttpStatus.OK)
    public List<CommentResponseDTO> findAllComments(@PathVariable Long eventId) {
        return service.findAllCommentsByEventId(eventId);
    }

    @GetMapping("/{commentId}")
    @ResponseBody
    @ResponseStatus(code = HttpStatus.OK)
    public CommentResponseDTO findCommentById(@PathVariable Long commentId) {
        return service.findCommentById(commentId);
    }

    @PutMapping("/{commentId}")
    @ResponseStatus(code = HttpStatus.OK)
    public CommentResponseDTO updateComment(@RequestBody UpdateCommentDTO comment, 
                                       @PathVariable Long commentId,
                                       @PathVariable Long userId,
                                       @PathVariable Long eventId) {
        return service.updateComment(comment, commentId, userId, eventId);
    }

    @DeleteMapping("/{commentId}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void deleteComment(@PathVariable Long commentId) {
        service.deleteComment(commentId);
    }

}
