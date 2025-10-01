package com.project.event_master.dtos.comment;

import java.time.Instant;
import java.util.Objects;

import com.project.event_master.domain.EventEntity;
import com.project.event_master.domain.UserEntity;

public class CommentResponseDTO {

    // ATTRIBUTES ------------------------------------------------------------------

    private Long id;

    private String text;

    private UserEntity author;
    private EventEntity event;

    private Instant createdAt;
    private Instant editedAt;

    // DEFAULT CONSTRUCTOR ---------------------------------------------------------

    public CommentResponseDTO() {}

    // GETTERS AND SETTERS ---------------------------------------------------------

    public Long getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public UserEntity getAuthor() {
        return author;
    }

    public EventEntity getEvent() {
        return event;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }
    
    public Instant getEditedAt() {
        return editedAt;
    }

    // TO STRING -------------------------------------------------------------------

    @Override
    public String toString() {
        return "CommentEntity [id = " + id + ", text=" + text + ", author=" + author + ", event=" + event + ", createdAt="
                + createdAt + "edited=" + editedAt + "]";
    }

    // HASH CODE AND EQUALS --------------------------------------------------------

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
