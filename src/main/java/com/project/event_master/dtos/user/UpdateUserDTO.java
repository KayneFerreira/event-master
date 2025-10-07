package com.project.event_master.dtos.user;

import java.time.LocalDate;
import java.util.Objects;

import com.project.event_master.dtos.address.UpdateAddressDTO;

public class UpdateUserDTO {

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

    private UpdateAddressDTO address;

    // CONSTRUCTORS ---------------------------------------------------------------------

    public UpdateUserDTO() {}

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

    public UpdateAddressDTO getAddress() {
        return address;
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

    public void setAddress(UpdateAddressDTO address) {
        this.address = address;
    }

    // TO STRING ------------------------------------------------------------------------

    @Override
    public String toString() {
        return "UserEntity [name=" + name + ", birthDate=" + birthDate + ", cpf=" + cpf 
                + ", address=" + address + "]";
    }

    // HASH CODE AND EQUALS -------------------------------------------------------------

    @Override
    public int hashCode() {
        return Objects.hash(name, birthDate, cpf, address);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        UpdateUserDTO other = (UpdateUserDTO) obj;
        return Objects.equals(name, other.name) && Objects.equals(birthDate, other.birthDate)
                && Objects.equals(cpf, other.cpf) && Objects.equals(address, other.address);
    }

}
