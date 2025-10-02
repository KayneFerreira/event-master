package com.project.event_master.dtos.event;

import java.util.Objects;

import com.project.event_master.domain.PhysicalAddress;

public class UpdateEventDTO {

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

    // DEFAULT CONSTRUCTOR ---------------------------------------------------------

    public UpdateEventDTO() {}

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

    // TO STRING -------------------------------------------------------------------

    @Override
    public String toString() {
        return "EventEntity [title=" + title + ", address=" + address + "]";
    }

    // HASH CODE AND EQUALS---------------------------------------------------------

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
        UpdateEventDTO other = (UpdateEventDTO) obj;
        return Objects.equals(title, other.title) && Objects.equals(address, other.address);
    }

}
