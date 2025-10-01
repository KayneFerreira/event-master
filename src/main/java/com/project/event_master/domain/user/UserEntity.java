package com.project.event_master.domain.user;

import java.time.LocalDate;
import java.util.Objects;

import com.project.event_master.domain.address.PhysicalAddress;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class UserEntity {

    // ATTRIBUTES ------------------------------------------------------------------

    /*
        TODO:
            [ ] Fill attributes
                - Create getters and setters
                - Update toString
            [x] Create associations
                - Address
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private LocalDate birthDate;
    private String cpf;

    @ManyToOne(cascade = CascadeType.ALL)
    private PhysicalAddress address;

    // DEFAULT CONSTRUCTOR ---------------------------------------------------------

    public UserEntity() {}

    // GETTERS AND SETTERS ---------------------------------------------------------

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
        return "UserEntity [id=" + id + ", name=" + name + ", birthDate=" + birthDate + ", cpf=" + cpf + ", address="
                + address + "]";
    }

    // HASH CODE AND EQUALS --------------------------------------------------------
    
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        UserEntity other = (UserEntity) obj;
        return Objects.equals(id, other.id);
    }

}
