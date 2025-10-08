package com.project.event_master.dtos.event;

import java.util.List;
import java.util.Objects;

import com.project.event_master.dtos.address.AddressResponseDTO;

public class EventResponseDTO {

    // ATTRIBUTES -----------------------------------------------------------------------
    /*
        TODO:
            [ ] Fill attributes
                - Create getters and setters
                - Update toString
            [x] Create associations
                - Address
                - Comments
     */
    private final Long id;

    private final String title;

    private final AddressResponseDTO address;

    private final List<EventCommentDisplayDTO> comments;

    // CONSTRUCTORS ---------------------------------------------------------------------

    public EventResponseDTO(Long id, String title, AddressResponseDTO address, List<EventCommentDisplayDTO> comments) {
        this.id = id;
        this.title = title;
        this.address = address;
        this.comments = comments;
    }

    // GETTERS --------------------------------------------------------------------------

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public AddressResponseDTO getAddress() {
        return address;
    }

    public List<EventCommentDisplayDTO> getComments() {
        return comments;
    }

    // TO STRING ------------------------------------------------------------------------

    @Override
    public String toString() {
        return "EventEntity [id = " + id + ", title=" + title + ", address=" + address + "]";
    }

    // HASH CODE AND EQUALS--------------------------------------------------------------

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
