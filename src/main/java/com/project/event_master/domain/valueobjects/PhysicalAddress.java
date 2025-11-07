package com.project.event_master.domain.valueobjects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "address")
@Data
@NoArgsConstructor
public class PhysicalAddress {

    // ATTRIBUTES -----------------------------------------------------------------------

    /*
        TODO:
            [ ] Fill attributes
                - Create getters and setters
                - Update toString
    */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String city;

}
