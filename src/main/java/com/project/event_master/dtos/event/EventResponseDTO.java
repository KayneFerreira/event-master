package com.project.event_master.dtos.event;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.project.event_master.domain.PhysicalAddress;
import com.project.event_master.domain.CommentEntity;

public class EventResponseDTO {

    // ATTRIBUTES ------------------------------------------------------------------
    /*
        TODO:
            [ ] Fill attributes
                - Create getters and setters
                - Update toString
            [x] Create associations
                - Address
                - Comments
     */
    private Long id;

    private String title;

    private PhysicalAddress address;

    private List<CommentEntity> comments = new ArrayList<>();

    // DEFAULT CONSTRUCTOR ---------------------------------------------------------

    public EventResponseDTO() {}

    // GETTERS AND SETTERS----------------------------------------------------------

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public PhysicalAddress getAddress() {
        return address;
    }

    public List<CommentEntity> getComments() {
        return comments;
    }

    // TO STRING -------------------------------------------------------------------

    @Override
    public String toString() {
        return "EventEntity [id = " + id + ", title=" + title + ", address=" + address + "]";
    }

    // HASH CODE AND EQUALS---------------------------------------------------------

    @Override
    public int hashCode() {
        return Objects.hash(id, title, address, comments);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        EventResponseDTO other = (EventResponseDTO) obj;
        return Objects.equals(id, other.id) && Objects.equals(title, other.title)
                && Objects.equals(address, other.address) && Objects.equals(comments, other.comments);
    }

}
