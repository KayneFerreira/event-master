package com.project.event_master.dtos.user;

import java.time.LocalDate;
import java.util.Objects;

import com.project.event_master.domain.valueobjects.PhysicalAddress;

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

    private final PhysicalAddress address;

    // CONSTRUCTORS ---------------------------------------------------------------------

    public UserResponseDTO(Long id, String name, LocalDate birthDate, String cpf, PhysicalAddress address) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.cpf = cpf;
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

    public PhysicalAddress getAddress() {
        return address;
    }

    // TO STRING ------------------------------------------------------------------------

    @Override
    public String toString() {
        return "UserResponseDTO [id = " + id + ", name=" + name + ", birthDate=" + birthDate 
                + ", cpf=" + cpf + ", address=" + address + "]";
    }
    
    // HASH CODE AND EQUALS -------------------------------------------------------------

    @Override
    public int hashCode() {
        return Objects.hash(id, name, birthDate, cpf, address);
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
        return Objects.equals(id, other.id) && Objects.equals(name, other.name)
                && Objects.equals(birthDate, other.birthDate) && Objects.equals(cpf, other.cpf)
                && Objects.equals(address, other.address);
    }

}
