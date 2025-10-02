package com.project.event_master.dtos.comment;

import java.util.Objects;

public class CommentEventDTO {

    // ATTRIBUTES -----------------------------------------------------------------------

    private Long id;
    private String title;

    // CONSTRUCTORS ---------------------------------------------------------------------

    public CommentEventDTO(Long id, String title) {
        this.id = id;
        this.title = title;
    }

    // GETTERS --------------------------------------------------------------------------

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    // TO STRING ------------------------------------------------------------------------

    @Override
    public String toString() {
        return "EventEntity [id= " + id + ", title=" + title + "]";
    }

    // HASH CODE AND EQUALS--------------------------------------------------------------

    @Override
    public int hashCode() {
        return Objects.hash(id, title);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        CommentEventDTO other = (CommentEventDTO) obj;
        return Objects.equals(id, other.id) && Objects.equals(title, other.title);
    }

}
