package com.project.event_master.dtos.address;

import java.util.Objects;

public class CreateAddressDTO {

    // ATTRIBUTES -----------------------------------------------------------------------

    private String city;

    // CONSTRUCTORS ---------------------------------------------------------------------

    public CreateAddressDTO() {}

    // GETTERS --------------------------------------------------------------------------

    public String getCity() {
        return city;
    }

    // SETTERS --------------------------------------------------------------------------
    
    public void setCity(String city) {
        this.city = city;
    }

    // TO STRING ------------------------------------------------------------------------
    
    @Override
    public String toString() {
        return "CreateAddressDTO [city=" + city + "]";
    }

    // HASH CODE AND EQUALS -------------------------------------------------------------

    @Override
    public int hashCode() {
        return Objects.hash(city);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        CreateAddressDTO other = (CreateAddressDTO) obj;
        return Objects.equals(city, other.city);
    }

}
