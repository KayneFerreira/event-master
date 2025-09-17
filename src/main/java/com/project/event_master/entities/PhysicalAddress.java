package com.project.event_master.entities;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "address")
public class PhysicalAddress {

    // ATTRIBUTES
    /*
        TODO:
            [ ] Fill attributes
            [ ] Create getters and setters
            [ ] Update constructors
            [ ] Update toString
            [ ] Update hashcode and equals
    */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String city;

    // DEFAULT CONSTRUCTORS
    public PhysicalAddress() {}

    public PhysicalAddress(Long id, String city) {
        this.id = id;
        this.city = city;
    }

    // GETTERS AND SETTERS
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    // TO STRING
    @Override
    public String toString() {
        return "PhysicalAddress [id=" + id + ", city=" + city + "]";
    }

    // HASHCODE AND EQUALS
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
        PhysicalAddress other = (PhysicalAddress) obj;
        return Objects.equals(id, other.id);
    }
    
}
