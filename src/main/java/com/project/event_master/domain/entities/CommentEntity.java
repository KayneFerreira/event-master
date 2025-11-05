package com.project.event_master.domain.entities;

import java.time.Instant;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "comments")
public class CommentEntity {

    // ATTRIBUTES -----------------------------------------------------------------------

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String text;

    @ManyToOne
    @JsonIgnoreProperties({
        "birthDate",
        "cpf",
        "password",
        "address"
    })
    private UserEntity commentAuthor;

    @ManyToOne
    @JsonBackReference
    private EventEntity commentEvent;

    private Instant createdAt;

    private Instant editedAt;

    // CONSTRUCTORS ---------------------------------------------------------------------

    public CommentEntity() {}

    // GETTERS --------------------------------------------------------------------------

    public Long getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public UserEntity getCommentAuthor() {
        return commentAuthor;
    }

    public EventEntity getCommentEvent() {
        return commentEvent;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public Instant getEditedAt() {
        return editedAt;
    }

    // SETTERS --------------------------------------------------------------------------

    public void setId(Long id) {
        this.id = id;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setCommentAuthor(UserEntity commentAuthor) {
        this.commentAuthor = commentAuthor;
    }

    public void setCommentEvent(EventEntity commentEvent) {
        this.commentEvent = commentEvent;
    }

    public void setCreatedAt() {
        this.createdAt = Instant.now();
    }

    public void setEditedAt() {
        this.editedAt = Instant.now();
    }

    // TO STRING ------------------------------------------------------------------------

    @Override
	public String toString() {
		return "CommentEntity [id=" + id + ", text=" + text + ", commentAuthor=" 
				+ commentAuthor + ", commentEvent=" + commentEvent + ", createdAt=" 
				+ createdAt + ", editedAt=" + editedAt + "]";
	}

    // HASH CODE AND EQUALS -------------------------------------------------------------

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
