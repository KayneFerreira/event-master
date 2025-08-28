package com.project.event_master.entities;

import java.time.Instant;
import java.time.LocalDate;

import com.project.event_master.entities.enums.AccessLevel;

public class UserEntity {

    Long userId;
    String name;
    String cpf;
    LocalDate birthDate;
    String email;
    String phoneNumber;
    String username;
    String password;    // TEMP
    PhysicalAddress address;
    AccessLevel accessLevel;
    Instant createdAt;
    
}
