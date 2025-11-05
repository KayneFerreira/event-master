package com.project.event_master.dtos.comment;

import java.time.Instant;
import java.util.Objects;

public class CreateCommentDTO {

    // ATTRIBUTES -----------------------------------------------------------------------

    private String text;

    private CommentAuthorDTO commentAuthor;
    private CommentEventDTO commentEvent;

    private Instant createdAt;

    // CONSTRUCTORS ---------------------------------------------------------------------

    public CreateCommentDTO() {}

    // GETTERS --------------------------------------------------------------------------

    public String getText() {
        return text;
    }

    public CommentAuthorDTO getCommentAuthor() {
        return commentAuthor;
    }

    public CommentEventDTO getCommentEvent() {
        return commentEvent;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    // SETTERS --------------------------------------------------------------------------

    public void setText(String text) {
        this.text = text;
    }

    public void setAuthor(CommentAuthorDTO commentAuthor) {
        this.commentAuthor = commentAuthor;
    }

    public void setCommentEvent(CommentEventDTO commentEvent) {
        this.commentEvent = commentEvent;
    }

    public void setCreatedAt() {
        this.createdAt = Instant.now();
    }
    
    // TO STRING ------------------------------------------------------------------------

    @Override
    public String toString() {
        return "CommentEntity [text=" + text + ", commentAuthor=" + commentAuthor + ", commentEvent=" + commentEvent 
                + ", createdAt=" + createdAt + "]";
    }

    // HASH CODE AND EQUALS -------------------------------------------------------------

    @Override
    public int hashCode() {
        return Objects.hash(text, commentAuthor, commentEvent, createdAt);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        CreateCommentDTO other = (CreateCommentDTO) obj;
        return Objects.equals(text, other.text) && Objects.equals(commentAuthor, other.commentAuthor)
                && Objects.equals(commentEvent, other.commentEvent) && Objects.equals(createdAt, other.createdAt);
    }

}
