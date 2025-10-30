package com.project.event_master.dtos.event;

import java.util.Objects;

import com.project.event_master.dtos.address.CreateAddressDTO;
import com.project.event_master.dtos.user.EventAuthorDTO;

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

    private CreateAddressDTO address;
    
    private EventAuthorDTO eventAuthor;

    // CONSTRUCTORS ---------------------------------------------------------------------

	public CreateEventDTO() {}

    // GETTERS --------------------------------------------------------------------------

    public String getTitle() {
        return title;
    }

    public CreateAddressDTO getAddress() {
        return address;
    }

    public EventAuthorDTO getEventAuthor() {
		return eventAuthor;
	}

    // SETTERS --------------------------------------------------------------------------

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAddress(CreateAddressDTO address) {
        this.address = address;
    }

	public void setEventAuthor(EventAuthorDTO eventAuthor) {
		this.eventAuthor = eventAuthor;
	}

    // TO STRING ------------------------------------------------------------------------

    @Override
	public String toString() {
		return "CreateEventDTO [title=" + title + ", address=" + address + ", eventAuthor=" + eventAuthor + "]";
	}

    // HASH CODE AND EQUALS--------------------------------------------------------------

    @Override
	public int hashCode() {
		return Objects.hash(address, eventAuthor, title);
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
		return Objects.equals(address, other.address) && Objects.equals(eventAuthor, other.eventAuthor)
				&& Objects.equals(title, other.title);
	}

}
