package com.project.event_master.dtos.event;

import java.util.Objects;

import com.project.event_master.domain.PhysicalAddress;

public class CreateEventDTO {

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
    private String title;

    private PhysicalAddress address;

    // CONSTRUCTORS ---------------------------------------------------------------------

    public CreateEventDTO() {}

    // GETTERS --------------------------------------------------------------------------

    public String getTitle() {
        return title;
    }

    public PhysicalAddress getAddress() {
        return address;
    }

    // SETTERS --------------------------------------------------------------------------

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAddress(PhysicalAddress address) {
        this.address = address;
    }

    // TO STRING ------------------------------------------------------------------------

    @Override
    public String toString() {
        return "EventEntity [title=" + title + ", address=" + address + "]";
    }

    // HASH CODE AND EQUALS--------------------------------------------------------------

    @Override
    public int hashCode() {
        return Objects.hash(title, address);
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
        return Objects.equals(title, other.title) && Objects.equals(address, other.address);
    }

}
