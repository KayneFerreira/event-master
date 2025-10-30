package com.project.event_master.dtos.user;

import java.util.Objects;

public class EventAuthorDTO {
	
	private Long id;
	private String username;
	
	public EventAuthorDTO () {}
	
	// GETTERS --------------------------------------------------------------------------

	public Long getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}
	
	// SETTERS --------------------------------------------------------------------------

	public void setId(Long id) {
		this.id = id;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	// OTHERS ---------------------------------------------------------------------------
	
	@Override
	public String toString() {
		return "EventAuthorDTO [id=" + id + ", username=" + username + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, username);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EventAuthorDTO other = (EventAuthorDTO) obj;
		return Objects.equals(id, other.id) && Objects.equals(username, other.username);
	}

}
