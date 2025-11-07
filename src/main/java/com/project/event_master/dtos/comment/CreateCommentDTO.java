package com.project.event_master.dtos.comment;

import java.time.Instant;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CreateCommentDTO {

    /*
        TODO:
            [ ] Fill attributes
    */
	
    private String text;

    private CommentAuthorDTO commentAuthor;
    private CommentEventDTO commentEvent;

    private Instant createdAt;

}
