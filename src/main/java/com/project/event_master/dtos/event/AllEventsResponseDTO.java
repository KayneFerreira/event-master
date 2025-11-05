package com.project.event_master.dtos.event;

import java.util.Objects;

import com.project.event_master.dtos.address.AddressResponseDTO;

public class AllEventsResponseDTO {

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

    private final AddressResponseDTO eventAddress;
    
    private final EventAuthorDTO eventAuthor;

    // CONSTRUCTORS ---------------------------------------------------------------------

    public AllEventsResponseDTO(Long id, String title, AddressResponseDTO eventAddress, 
    		EventAuthorDTO eventAuthor) {
		this.id = id;
		this.title = title;
		this.eventAddress = eventAddress;
		this.eventAuthor = eventAuthor;
	}

    // GETTERS --------------------------------------------------------------------------

	public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public AddressResponseDTO getEventAddress() {
        return eventAddress;
    }

    public EventAuthorDTO getEventAuthor() {
		return eventAuthor;
	}

    // TO STRING ------------------------------------------------------------------------

    @Override
	public String toString() {
		return "EventResponseDTO [id=" + id + ", title=" + title + ", eventAddress=" 
				+ eventAddress + ", eventAuthor=" + eventAuthor + "]";
	}

    // HASH CODE AND EQUALS--------------------------------------------------------------

    @Override
	public int hashCode() {
		return Objects.hash(eventAddress, eventAuthor, id, title);
	}

    @Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AllEventsResponseDTO other = (AllEventsResponseDTO) obj;
		return Objects.equals(eventAddress, other.eventAddress) && Objects.equals(eventAuthor, other.eventAuthor)
				&& Objects.equals(id, other.id) && Objects.equals(title, other.title);
	}

}
