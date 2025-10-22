package com.project.event_master.dtos.user;

import java.util.Objects;

public class AuthUserResponseDTO {

	private final UserResponseDTO dto;
	private final String token;
	
	public AuthUserResponseDTO(UserResponseDTO dto, String token) {
		this.dto = dto;
		this.token = token;
	}

	public UserResponseDTO getDto() {
		return dto;
	}

	public String getToken() {
		return token;
	}

	@Override
	public String toString() {
		return "AuthUserResponseDTO [dto=" + dto + ", token=" + token + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(dto, token);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AuthUserResponseDTO other = (AuthUserResponseDTO) obj;
		return Objects.equals(dto, other.dto) && Objects.equals(token, other.token);
	}
	
}
