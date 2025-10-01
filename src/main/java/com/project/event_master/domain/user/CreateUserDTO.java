package com.project.event_master.domain.user;

import java.time.LocalDate;
import java.util.Objects;

import com.project.event_master.domain.address.PhysicalAddress;

public class CreateUserDTO {

    // ATTRIBUTES ------------------------------------------------------------------

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

    private PhysicalAddress address;

    // DEFAULT CONSTRUCTOR ---------------------------------------------------------

    public CreateUserDTO() {}

    // GETTERS AND SETTERS ---------------------------------------------------------

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public PhysicalAddress getAddress() {
        return address;
    }

    public void setAddress(PhysicalAddress address) {
        this.address = address;
    }

    // TO STRING -------------------------------------------------------------------

    @Override
    public String toString() {
        return "CreateUserDTO [name=" + name + ", birthDate=" + birthDate + ", cpf=" + cpf + ", address="
                + address + "]";
    }

    // HASH CODE AND EQUALS --------------------------------------------------------

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
        CreateUserDTO other = (CreateUserDTO) obj;
        return Objects.equals(name, other.name) && Objects.equals(birthDate, other.birthDate)
                && Objects.equals(cpf, other.cpf) && Objects.equals(address, other.address);
    }

}
