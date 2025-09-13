package com.project.event_master.entities;

import java.util.Objects;

import com.project.event_master.entities.enums.State;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "addresses")
public class PhysicalAddress {

    // ATTRIBUTES
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long addressId;

    private String street;
    private String addressComplement;
    private String zipCode;
    
    private String district;
    private String city;
    private State state;

    // BUILDER PATTERN
    public static class Builder {

        private Long addressId;
        private String street;
        private String addressComplement;
        private String zipCode;
        private String district;
        private String city;
        private State state;

        public Builder id(Long addressId) {
            this.addressId = addressId;
            return this;
        }

        public Builder street(String street) {
            this.street = street;
            return this;
        }

        public Builder addressComplement(String addressComplement) {
            this.addressComplement = addressComplement;
            return this;
        }

        public Builder zipCode(String zipCode) {
            this.zipCode = zipCode;
            return this;
        }

        public Builder district(String district) {
            this.district = district;
            return this;
        }

        public Builder city(String city) {
            this.city = city;
            return this;
        }

        public Builder state(State state) {
            this.state = state;
            return this;
        }

        public PhysicalAddress build() {
            return new PhysicalAddress(this);
        }
    }

    // BUILDER CONSTRUCTORS
    private PhysicalAddress(Builder builder) {
        this.addressId = builder.addressId;
        this.street = builder.street;
        this.addressComplement = builder.addressComplement;
        this.zipCode = builder.zipCode;
        this.district = builder.district;
        this.city = builder.city;
        this.state = builder.state;
    }

    // // DEFAULT CONSTRUCTORS
    public PhysicalAddress() {}
    // public PhysicalAddress(Long id, String street, String addressComplement, String zipCode, String district,
    //         String city, State state) {
    //     this.id = id;
    //     this.street = street;
    //     this.addressComplement = addressComplement;
    //     this.zipCode = zipCode;
    //     this.district = district;
    //     this.city = city;
    //     this.state = state;
    // }

    // GETTERS & SETTERS
    public Long getAddressId() {
        return addressId;
    }
    public void setAddressId(Long id) {
        this.addressId = id;
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
        return "PhysicalAddress [id=" + addressId + ", street=" + street + ", addressComplement=" + addressComplement
                + ", zipCode=" + zipCode + ", district=" + district + ", city=" + city + ", state=" + state + "]";
    }

    // HASH CODE & EQUALS
    @Override
    public int hashCode() {
        return Objects.hash(addressId, street, addressComplement, zipCode, district, city, state);
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
        return Objects.equals(addressId, other.addressId) && Objects.equals(street, other.street)
                && Objects.equals(addressComplement, other.addressComplement) && Objects.equals(zipCode, other.zipCode)
                && Objects.equals(district, other.district) && Objects.equals(city, other.city) && state == other.state;
    }

}
