package com.project.event_master.dtos.user;

import java.time.LocalDate;
import java.util.Objects;

import com.project.event_master.domain.enums.UserRoles;
import com.project.event_master.dtos.address.AddressResponseDTO;

public class UserResponseDTO {

    // ATTRIBUTES -----------------------------------------------------------------------

    /*
        TODO:
            [ ] Fill attributes
                - Create getters and setters
                - Update toString
            [x] Create associations
                - Address
     */
    private final Long id;

    private final String name;
    private final LocalDate birthDate;
    private final String cpf;
    
    private final String username;	// WARN: REMOVE AFTER TEST
    private final String password;	// WARN: REMOVE AFTER TEST
    private final UserRoles role;

	private final AddressResponseDTO address;

    // CONSTRUCTORS ---------------------------------------------------------------------

    public UserResponseDTO(Long id, String name, LocalDate birthDate, String cpf, 
    		String username, String password, UserRoles role, AddressResponseDTO address) {
		super();
		this.id = id;
		this.name = name;
		this.birthDate = birthDate;
		this.cpf = cpf;
		this.username = username;
		this.password = password;
		this.role = role;
		this.address = address;
	}

    // GETTERS --------------------------------------------------------------------------

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getCpf() {
        return cpf;
    }

    public AddressResponseDTO getAddress() {
        return address;
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
	
    // TO STRING ------------------------------------------------------------------------

	@Override
	public String toString() {
		return "UserResponseDTO [id=" + id + ", name=" + name + ", birthDate=" 
				+ birthDate + ", cpf=" + cpf + ", username=" + username + ", password=" 
				+ password + ", role=" + role + ", address=" + address + "]";
	}
    
    // HASH CODE AND EQUALS -------------------------------------------------------------

    @Override
	public int hashCode() {
		return Objects.hash(address, birthDate, cpf, id, name, password, role, username);
	}

    @Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserResponseDTO other = (UserResponseDTO) obj;
		return Objects.equals(address, other.address) && Objects.equals(birthDate, other.birthDate)
				&& Objects.equals(cpf, other.cpf) && Objects.equals(id, other.id) && Objects.equals(name, other.name)
				&& Objects.equals(password, other.password) && role == other.role
				&& Objects.equals(username, other.username);
	}

}
