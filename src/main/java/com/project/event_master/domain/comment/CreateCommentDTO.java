package com.project.event_master.domain.comment;

import java.time.Instant;
import java.util.Objects;

import com.project.event_master.domain.event.EventEntity;
import com.project.event_master.domain.user.UserEntity;

public class CreateCommentDTO {

    // ATTRIBUTES ------------------------------------------------------------------

    private String text;

    private UserEntity author;
    private EventEntity event;

    private Instant createdAt;
    private Instant editedAt;

    // DEFAULT CONSTRUCTOR ---------------------------------------------------------

    public CreateCommentDTO() {}

    // GETTERS AND SETTERS ---------------------------------------------------------

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public UserEntity getAuthor() {
        return author;
    }

    public void setAuthor(UserEntity author) {
        this.author = author;
    }

    public EventEntity getEvent() {
        return event;
    }

    public void setEvent(EventEntity event) {
        this.event = event;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt() {
        this.createdAt = Instant.now();
    }
    
    public Instant getEditedAt() {
        return editedAt;
    }

    public void setEditedAt() {
        this.editedAt = Instant.now();
    }

    // TO STRING -------------------------------------------------------------------

    @Override
    public String toString() {
        return "CommentEntity [text=" + text + ", author=" + author + ", event=" + event + ", createdAt="
                + createdAt + "edited=" + editedAt + "]";
    }

    // HASH CODE AND EQUALS --------------------------------------------------------

    @Override
    public int hashCode() {
        return Objects.hash(text, author, event, createdAt, editedAt);
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
                && Objects.equals(event, other.event) && Objects.equals(createdAt, other.createdAt)
                && Objects.equals(editedAt, other.editedAt);
    }

}
