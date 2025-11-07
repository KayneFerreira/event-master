package com.project.event_master.domain.entities;

import java.time.Instant;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "comments")
@Data
@NoArgsConstructor
public class CommentEntity {

    /*
        TODO:
            [ ] Fill attributes
    */
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String text;

    @ManyToOne
    @JsonIgnoreProperties({
        "birthDate",
        "cpf",
        "password",
        "address"
    })
    private UserEntity commentAuthor;

    @ManyToOne
    private EventEntity commentEvent;

    private Instant createdAt;

    private Instant editedAt;

    // CUSTOM SETTERS -------------------------------------
    
    public void setCreatedAt() {
        this.createdAt = Instant.now();
    }

    public void setEditedAt() {
        this.editedAt = Instant.now();
    }

}
