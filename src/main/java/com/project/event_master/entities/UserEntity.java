package com.project.event_master.entities;

import java.time.Instant;
import java.time.LocalDate;
import java.util.Objects;

import com.project.event_master.entities.enums.AccessLevel;

public class UserEntity {

    // ATTRIBUTES
    private Long userId;
    private String name;
    private String cpf;
    private LocalDate birthDate;
    private String email;
    private String phoneNumber;
    private String username;
    private String password;    // TEMP
    private PhysicalAddress address;
    private AccessLevel accessLevel;
    private Instant createdAt;

    // CONSTRUCTORS
    public UserEntity() {}
    public UserEntity(Long userId, String name, String cpf, LocalDate birthDate, 
            String email, String phoneNumber, String username, String password, 
            PhysicalAddress address, AccessLevel accessLevel, Instant createdAt
            ) {
        this.userId = userId;
        this.name = name;
        this.cpf = cpf;
        this.birthDate = birthDate;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.username = username;
        this.password = password;
        this.address = address;
        this.accessLevel = accessLevel;
        this.createdAt = createdAt;
    }

    // GETTERS & SETTERS
    public Long getUserId() {
        return userId;
    }
    public void setUserId(Long userId) {
        this.userId = userId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public LocalDate getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public PhysicalAddress getAddress() {
        return address;
    }
    public void setAddress(PhysicalAddress address) {
        this.address = address;
    }
    public AccessLevel getAccessLevel() {
        return accessLevel;
    }
    public void setAccessLevel(AccessLevel accessLevel) {
        this.accessLevel = accessLevel;
    }
    public Instant getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    // HASH CODE & EQUALS
    @Override
    public int hashCode() {
        return Objects.hash(userId, name, cpf, birthDate, email, phoneNumber, username, password, address, accessLevel,
                createdAt);
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
        return Objects.equals(userId, other.userId) && Objects.equals(name, other.name)
                && Objects.equals(cpf, other.cpf) && Objects.equals(birthDate, other.birthDate)
                && Objects.equals(email, other.email) && Objects.equals(phoneNumber, other.phoneNumber)
                && Objects.equals(username, other.username) && Objects.equals(password, other.password)
                && Objects.equals(address, other.address) && accessLevel == other.accessLevel
                && Objects.equals(createdAt, other.createdAt);
    }

}
