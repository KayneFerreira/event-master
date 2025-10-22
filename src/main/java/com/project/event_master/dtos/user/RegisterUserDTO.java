package com.project.event_master.dtos.user;

import java.time.LocalDate;
import java.util.Objects;

import com.project.event_master.domain.enums.UserRoles;
import com.project.event_master.dtos.address.CreateAddressDTO;

public class RegisterUserDTO {

    // ATTRIBUTES -----------------------------------------------------------------------

    /*
        TODO:
            [ ] Fill attributes
                - Create getters and setters
                - Update toString
            [x] Create associations
                - Address
     */
    private String name;
    private LocalDate birthDate;
    private String cpf;
    
    private String username;
    private String password;
    private UserRoles role;

    private CreateAddressDTO address;

    // CONSTRUCTORS ---------------------------------------------------------------------

    public RegisterUserDTO() {}

    // GETTERS --------------------------------------------------------------------------

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getCpf() {
        return cpf;
    }

    public CreateAddressDTO getAddress() {
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
	
    // SETTERS --------------------------------------------------------------------------

	public void setName(String name) {
        this.name = name;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setAddress(CreateAddressDTO address) {
        this.address = address;
    }

    public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setRole(UserRoles role) {
		this.role = role;
	}
	
    // TO STRING ------------------------------------------------------------------------

	@Override
	public String toString() {
		return "RegisterUserDTO [name=" + name + ", birthDate=" + birthDate + ", cpf=" + cpf 
				+ ", username=" + username + ", password=" + password + ", role=" + role 
				+ ", address=" + address + "]";
	}

    // HASH CODE AND EQUALS -------------------------------------------------------------

    @Override
	public int hashCode() {
		return Objects.hash(address, birthDate, cpf, name, password, role, username);
	}

    @Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RegisterUserDTO other = (RegisterUserDTO) obj;
		return Objects.equals(address, other.address) && Objects.equals(birthDate, other.birthDate)
				&& Objects.equals(cpf, other.cpf) && Objects.equals(name, other.name)
				&& Objects.equals(password, other.password) && role == other.role
				&& Objects.equals(username, other.username);
	}

}
