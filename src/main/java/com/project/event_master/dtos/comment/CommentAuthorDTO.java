package com.project.event_master.dtos.comment;

import java.util.Objects;

public class CommentAuthorDTO {

    // ATTRIBUTES -----------------------------------------------------------------------

    private Long id;
    private String name;

    // CONSTRUCTORS ---------------------------------------------------------------------

    public CommentAuthorDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    // GETTERS --------------------------------------------------------------------------

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // TO STRING ------------------------------------------------------------------------

    @Override
    public String toString() {
        return "CreateUserDTO [id= " + id + ", name=" + name + "]";
    }

    // HASH CODE AND EQUALS -------------------------------------------------------------

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
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
        return Objects.equals(id, other.id) && Objects.equals(name, other.name);
    }

}
