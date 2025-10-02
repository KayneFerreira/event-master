package com.project.event_master.dtos.comment;

import java.time.Instant;
import java.util.Objects;

public class CreateCommentDTO {

    // ATTRIBUTES -----------------------------------------------------------------------

    private String text;

    private CommentAuthorDTO author;
    private CommentEventDTO event;

    private Instant createdAt;

    // CONSTRUCTORS ---------------------------------------------------------------------

    public CreateCommentDTO() {}

    // GETTERS --------------------------------------------------------------------------

    public String getText() {
        return text;
    }

    public CommentAuthorDTO getAuthor() {
        return author;
    }

    public CommentEventDTO getEvent() {
        return event;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    // SETTERS --------------------------------------------------------------------------

    public void setText(String text) {
        this.text = text;
    }

    public void setAuthor(CommentAuthorDTO author) {
        this.author = author;
    }

    public void setEvent(CommentEventDTO event) {
        this.event = event;
    }

    public void setCreatedAt() {
        this.createdAt = Instant.now();
    }
    
    // TO STRING ------------------------------------------------------------------------

    @Override
    public String toString() {
        return "CommentEntity [text=" + text + ", author=" + author + ", event=" + event 
                + ", createdAt=" + createdAt + "]";
    }

    // HASH CODE AND EQUALS -------------------------------------------------------------

    @Override
    public int hashCode() {
        return Objects.hash(text, author, event, createdAt);
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
        return Objects.equals(text, other.text) && Objects.equals(author, other.author)
                && Objects.equals(event, other.event) && Objects.equals(createdAt, other.createdAt);
    }

}
