package com.project.event_master.domain.comment;

import java.time.Instant;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.project.event_master.domain.event.EventEntity;
import com.project.event_master.domain.user.UserEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "comments")
public class CommentEntity {

    // ATTRIBUTES ------------------------------------------------------------------

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String text;

    @ManyToOne
    private UserEntity author;

    @ManyToOne
    @JsonBackReference
    private EventEntity event;

    private Instant createdAt;

    private Instant editedAt;

    // DEFAULT CONSTRUCTOR ---------------------------------------------------------

    public CommentEntity() {}

    // GETTERS AND SETTERS ---------------------------------------------------------

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
        return "CommentEntity [id=" + id + ", text=" + text + ", author=" + author + ", event=" + event + ", createdAt="
                + createdAt + "edited=" + editedAt + "]";
    }

    // HASH CODE AND EQUALS --------------------------------------------------------

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        CommentEntity other = (CommentEntity) obj;
        return Objects.equals(id, other.id);
    }

}
