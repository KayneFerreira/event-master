package com.project.event_master.entities;

import java.util.Objects;

import com.project.event_master.entities.enums.State;

public class PhysicalAddress {

    // ATTRIBUTES
    private Long id;
    private String street;
    private String addressComplement;
    private String zipCode;
    private String district;
    private String city;
    private State state;

    // CONSTRUCTORS
    public PhysicalAddress() {}
    public PhysicalAddress(Long id, String street, String addressComplement, String zipCode, String district,
            String city, State state) {
        this.id = id;
        this.street = street;
        this.addressComplement = addressComplement;
        this.zipCode = zipCode;
        this.district = district;
        this.city = city;
        this.state = state;
    }

    // GETTERS & SETTERS
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public String getAddressComplement() {
        return addressComplement;
    }
    public void setAddressComplement(String addressComplement) {
        this.addressComplement = addressComplement;
    }
    public String getZipCode() {
        return zipCode;
    }
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
    public String getDistrict() {
        return district;
    }
    public void setDistrict(String district) {
        this.district = district;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public State getState() {
        return state;
    }
    public void setState(State state) {
        this.state = state;
    }

    // TO STRING
    @Override
    public String toString() {
        return "PhysicalAddress [id=" + id + ", street=" + street + ", addressComplement=" + addressComplement
                + ", zipCode=" + zipCode + ", district=" + district + ", city=" + city + ", state=" + state + "]";
    }

    // HASH CODE & EQUALS
    @Override
    public int hashCode() {
        return Objects.hash(id, street, addressComplement, zipCode, district, city, state);
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
        return Objects.equals(id, other.id) && Objects.equals(street, other.street)
                && Objects.equals(addressComplement, other.addressComplement) && Objects.equals(zipCode, other.zipCode)
                && Objects.equals(district, other.district) && Objects.equals(city, other.city) && state == other.state;
    }

}
