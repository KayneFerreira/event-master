package com.project.event_master.domain.event;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.project.event_master.domain.address.PhysicalAddress;
import com.project.event_master.domain.comment.CommentEntity;

public class CreateEventDTO {

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
    private String title;

    private PhysicalAddress address;

    private List<CommentEntity> comments = new ArrayList<>();

    // DEFAULT CONSTRUCTOR ---------------------------------------------------------

    public CreateEventDTO() {}

    // GETTERS AND SETTERS----------------------------------------------------------

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public PhysicalAddress getAddress() {
        return address;
    }

    public void setAddress(PhysicalAddress address) {
        this.address = address;
    }

    public List<CommentEntity> getComments() {
        return comments;
    }

    // TO STRING -------------------------------------------------------------------

    @Override
    public String toString() {
        return "EventEntity [title=" + title + ", address=" + address + "]";
    }

    // HASH CODE AND EQUALS---------------------------------------------------------

    @Override
    public int hashCode() {
        return Objects.hash(title, address, comments);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        CreateEventDTO other = (CreateEventDTO) obj;
        return Objects.equals(title, other.title) && Objects.equals(address, other.address)
                && Objects.equals(comments, other.comments);
    }

}
