package com.project.event_master.domain.entities;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.project.event_master.domain.valueobjects.PhysicalAddress;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "events")
@Data
@NoArgsConstructor
public class EventEntity {

    /*
        TODO:
            [ ] Fill attributes
    */
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @ManyToOne(cascade = CascadeType.ALL)
    private PhysicalAddress eventAddress;
    
    @ManyToOne
    @JsonIgnoreProperties({
        "birthDate",
        "cpf",
        "password",
        "userAddress"
    })
    private UserEntity eventAuthor;

    @OneToMany(
        mappedBy = "commentEvent", 
        cascade = CascadeType.ALL,
        orphanRemoval = true,
        fetch = FetchType.LAZY
        )
    @JsonIgnore
    private List<CommentEntity> eventComments = new ArrayList<>();

}
