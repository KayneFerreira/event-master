package com.project.event_master.entities;

import com.project.event_master.entities.enums.State;

public class PhysicalAddress {

    // ATTRIBUTES
    Long id;
    String street;
    String addressComplement;
    String zipCode;
    String district;
    String city;
    State state;

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
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((street == null) ? 0 : street.hashCode());
        result = prime * result + ((addressComplement == null) ? 0 : addressComplement.hashCode());
        result = prime * result + ((zipCode == null) ? 0 : zipCode.hashCode());
        result = prime * result + ((district == null) ? 0 : district.hashCode());
        result = prime * result + ((city == null) ? 0 : city.hashCode());
        result = prime * result + ((state == null) ? 0 : state.hashCode());
        return result;
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
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (street == null) {
            if (other.street != null)
                return false;
        } else if (!street.equals(other.street))
            return false;
        if (addressComplement == null) {
            if (other.addressComplement != null)
                return false;
        } else if (!addressComplement.equals(other.addressComplement))
            return false;
        if (zipCode == null) {
            if (other.zipCode != null)
                return false;
        } else if (!zipCode.equals(other.zipCode))
            return false;
        if (district == null) {
            if (other.district != null)
                return false;
        } else if (!district.equals(other.district))
            return false;
        if (city == null) {
            if (other.city != null)
                return false;
        } else if (!city.equals(other.city))
            return false;
        if (state != other.state)
            return false;
        return true;
    }
    
}
