package com.project.event_master.dtos.comment;

import java.util.Objects;

public class CommentAuthorDTO {

    // ATTRIBUTES -----------------------------------------------------------------------

    private final Long authorId;
    private final String authorName;

    // CONSTRUCTORS ---------------------------------------------------------------------

    public CommentAuthorDTO(Long authorId, String authorName) {
        this.authorId = authorId;
        this.authorName = authorName;
    }

    // GETTERS --------------------------------------------------------------------------

    public Long getAuthorId() {
        return authorId;
    }

    public String getAuthorName() {
        return authorName;
    }

    // TO STRING ------------------------------------------------------------------------

    @Override
	public String toString() {
		return "CommentAuthorDTO [authorId=" + authorId + ", authorName=" + authorName + "]";
	}

    // HASH CODE AND EQUALS -------------------------------------------------------------

    @Override
	public int hashCode() {
		return Objects.hash(authorId, authorName);
	}

    @Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CommentAuthorDTO other = (CommentAuthorDTO) obj;
		return Objects.equals(authorId, other.authorId) && Objects.equals(authorName, other.authorName);
	}

}
