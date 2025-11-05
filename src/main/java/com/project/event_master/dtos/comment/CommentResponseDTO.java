package com.project.event_master.dtos.comment;

import java.time.Instant;
import java.util.Objects;

public class CommentResponseDTO {

    // ATTRIBUTES -----------------------------------------------------------------------

    private final Long id;

    private final String text;

    private final CommentAuthorDTO commentAuthor;
    private final CommentEventDTO commentEvent;

    private final Instant createdAt;
    private final Instant editedAt;

    // CONSTRUCTORS ---------------------------------------------------------------------

    public CommentResponseDTO(Long id, String text, CommentAuthorDTO commentAuthor, 
            CommentEventDTO commentEvent, Instant createdAt, Instant editedAt) {
        this.id = id;
        this.text = text;
        this.commentAuthor = commentAuthor;
        this.commentEvent = commentEvent;
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

    public CommentAuthorDTO getCommentAuthor() {
        return commentAuthor;
    }

    public CommentEventDTO getCommentEvent() {
        return commentEvent;
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
		return "CommentResponseDTO [id=" + id + ", text=" + text + ", commentAuthor=" 
				+ commentAuthor + ", commentEvent=" + commentEvent + ", createdAt=" 
				+ createdAt + ", editedAt=" + editedAt + "]";
	}

    // HASH CODE AND EQUALS -------------------------------------------------------------

    @Override
    public int hashCode() {
        return Objects.hash(id, text, commentAuthor, commentEvent, createdAt, editedAt);
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
        return Objects.equals(id, other.id) && Objects.equals(text, other.text) && Objects.equals(commentAuthor, other.commentAuthor)
                && Objects.equals(commentEvent, other.commentEvent) && Objects.equals(createdAt, other.createdAt)
                && Objects.equals(editedAt, other.editedAt);
    }

}
