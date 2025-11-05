package com.project.event_master.dtos.comment;

import java.util.Objects;

public class CommentEventDTO {

    // ATTRIBUTES -----------------------------------------------------------------------

    private final Long eventId;
    private final String eventTitle;

    // CONSTRUCTORS ---------------------------------------------------------------------

    public CommentEventDTO(Long eventId, String eventTitle) {
        this.eventId = eventId;
        this.eventTitle = eventTitle;
    }

    // GETTERS --------------------------------------------------------------------------

    public Long getEventId() {
        return eventId;
    }

    public String getEventTitle() {
        return eventTitle;
    }

    // TO STRING ------------------------------------------------------------------------

    @Override
	public String toString() {
		return "CommentEventDTO [eventId=" + eventId + ", eventTitle=" + eventTitle + "]";
	}

    // HASH CODE AND EQUALS--------------------------------------------------------------

    @Override
	public int hashCode() {
		return Objects.hash(eventId, eventTitle);
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
		return Objects.equals(eventId, other.eventId) && Objects.equals(eventTitle, other.eventTitle);
	}

}
