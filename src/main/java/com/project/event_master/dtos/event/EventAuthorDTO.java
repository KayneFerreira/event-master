package com.project.event_master.dtos.event;

import java.util.Objects;

public class EventAuthorDTO {
	
	private Long id;
	private String name;
	
	public EventAuthorDTO () {}
	
	// GETTERS --------------------------------------------------------------------------

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	// SETTERS --------------------------------------------------------------------------

	public void setId(Long id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	// OTHERS ---------------------------------------------------------------------------
	
	@Override
	public String toString() {
		return "EventAuthorDTO [id=" + id + ", name=" + name + "]";
	}

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
		EventAuthorDTO other = (EventAuthorDTO) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name);
	}

}
