package com.project.event_master.domain.entities;

import java.time.LocalDate;

import com.project.event_master.domain.enums.UserRoles;
import com.project.event_master.domain.valueobjects.PhysicalAddress;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@ToString(exclude = {"cpf", "password", "userAddress"})
public class UserEntity {

    /*
        TODO:
            [ ] Fill attributes
    */
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private LocalDate birthDate;
    private String cpf;
    
    private String username;
    private String password;
    
    @Enumerated(EnumType.STRING)
    private UserRoles role;

    @ManyToOne(cascade = CascadeType.ALL)
    private PhysicalAddress userAddress;

}
