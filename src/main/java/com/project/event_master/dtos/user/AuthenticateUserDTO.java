package com.project.event_master.dtos.user;

import java.util.Objects;

import com.project.event_master.domain.enums.UserRoles;

public class AuthenticateUserDTO {
	
	private final String username;
	private final String password;
	private final UserRoles role;
	
	public AuthenticateUserDTO(String username, String password, UserRoles role) {
		this.username = username;
		this.password = password;
		this.role = role;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}
	
	public UserRoles getRole() {
		return role;
	}

	@Override
	public String toString() {
		return "AuthenticateUserDTO [username=" + username + ", password=" + password + ", role=" + role + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(password, role, username);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AuthenticateUserDTO other = (AuthenticateUserDTO) obj;
		return Objects.equals(password, other.password) && role == other.role
				&& Objects.equals(username, other.username);
	}
	
}
