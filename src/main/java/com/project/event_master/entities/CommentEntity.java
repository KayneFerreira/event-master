package com.project.event_master.entities;

import java.time.Instant;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonBackReference;

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

    // DEFAULT CONSTRUCTORS --------------------------------------------------------

    public CommentEntity() {}

    public CommentEntity(Long id, String text, UserEntity author, EventEntity event) {
        this.id = id;
        this.text = text;
        this.author = author;
        this.event = event;
        this.createdAt = Instant.now();
    }

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

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = Instant.now();
    }

    // TO STRING -------------------------------------------------------------------

    @Override
    public String toString() {
        return "CommentEntity [id=" + id + ", text=" + text + ", author=" + author + ", event=" + event + ", createdAt="
                + createdAt + "]";
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
