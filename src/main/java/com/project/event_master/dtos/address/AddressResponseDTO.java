package com.project.event_master.dtos.address;

import java.util.Objects;

public class AddressResponseDTO {

    // ATTRIBUTES -----------------------------------------------------------------------

    private final Long id;

    private final String city;

    // CONSTRUCTORS ---------------------------------------------------------------------

    public AddressResponseDTO(Long id, String city) {
        this.id = id;
        this.city = city;
    }

    // GETTERS --------------------------------------------------------------------------

    public Long getId() {
        return id;
    }

    public String getCity() {
        return city;
    }

    // TO STRING ------------------------------------------------------------------------

    @Override
    public String toString() {
        return "UpdateAddressDTO [id=" + id + ", city=" + city + "]";
    }

    // HASH CODE AND EQUALS -------------------------------------------------------------

    @Override
    public int hashCode() {
        return Objects.hash(id, city);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        AddressResponseDTO other = (AddressResponseDTO) obj;
        return Objects.equals(id, other.id) && Objects.equals(city, other.city);
    }

}
