package com.project.event_master.dtos.event;

import java.time.Instant;
import java.util.Objects;

import com.project.event_master.dtos.comment.CommentAuthorDTO;

public class EventCommentDisplayDTO {

    // ATTRIBUTES -----------------------------------------------------------------------

    private final Long id;

    private final String text;

    private final CommentAuthorDTO author;

    private final Instant createdAt;
    private final Instant editedAt;
    
	public EventCommentDisplayDTO(Long id, String text, CommentAuthorDTO author, Instant createdAt, Instant editedAt) {
		this.id = id;
		this.text = text;
		this.author = author;
		this.createdAt = createdAt;
		this.editedAt = editedAt;
	}

	public Long getId() {
		return id;
	}

	public String getText() {
		return text;
	}

	public CommentAuthorDTO getAuthor() {
		return author;
	}

	public Instant getCreatedAt() {
		return createdAt;
	}

	public Instant getEditedAt() {
		return editedAt;
	}

	@Override
	public String toString() {
		return "EventCommentDisplayDTO [id=" + id + ", text=" + text + ", author=" + author 
				+ ", createdAt=" + createdAt + ", editedAt=" + editedAt + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(author, createdAt, editedAt, id, text);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EventCommentDisplayDTO other = (EventCommentDisplayDTO) obj;
		return Objects.equals(author, other.author) && Objects.equals(createdAt, other.createdAt)
				&& Objects.equals(editedAt, other.editedAt) && Objects.equals(id, other.id)
				&& Objects.equals(text, other.text);
	}

}