package com.project.event_master.dtos.comment;

import java.time.Instant;
import java.util.Objects;

public class CommentResponseDTO {

    // ATTRIBUTES -----------------------------------------------------------------------

    private Long id;

    private String text;

    private CommentAuthorDTO author;
    private CommentEventDTO event;

    private Instant createdAt;
    private Instant editedAt;

    // CONSTRUCTORS ---------------------------------------------------------------------

    public CommentResponseDTO(Long id, String text, CommentAuthorDTO author, 
            CommentEventDTO event, Instant createdAt, Instant editedAt) {
        this.id = id;
        this.text = text;
        this.author = author;
        this.event = event;
        this.createdAt = createdAt;
        this.editedAt = editedAt;
    }

    // GETTERS --------------------------------------------------------------------------

    public Long getId() {
        return id;
    }

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
    
    public Instant getEditedAt() {
        return editedAt;
    }

    // TO STRING ------------------------------------------------------------------------

    @Override
    public String toString() {
        return "CommentEntity [id = " + id + ", text=" + text + ", author=" + author 
                + ", event=" + event + ", createdAt=" + createdAt + ", edited=" + editedAt + "]";
    }

    // HASH CODE AND EQUALS -------------------------------------------------------------

    @Override
    public int hashCode() {
        return Objects.hash(id, text, author, event, createdAt, editedAt);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        CommentResponseDTO other = (CommentResponseDTO) obj;
        return Objects.equals(id, other.id) && Objects.equals(text, other.text) && Objects.equals(author, other.author)
                && Objects.equals(event, other.event) && Objects.equals(createdAt, other.createdAt)
                && Objects.equals(editedAt, other.editedAt);
    }

}
