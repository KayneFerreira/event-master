package com.project.event_master.domain.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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

@Entity
@Table(name = "events")
public class EventEntity {

    // ATTRIBUTES -----------------------------------------------------------------------
    /*
        TODO:
            [ ] Fill attributes
                - Create getters and setters
                - Update toString
            [x] Create associations
                - Address
                - Comments
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
        "address"
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

    // CONSTRUCTORS ---------------------------------------------------------------------

    public EventEntity() {}

    // GETTERS --------------------------------------------------------------------------

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public PhysicalAddress getEventAddress() {
        return eventAddress;
    }

    public List<CommentEntity> getEventComments() {
        return eventComments;
    }
    
    public UserEntity getEventAuthor() {
    	return eventAuthor;
    }

    // SETTERS --------------------------------------------------------------------------

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setEventAddress(PhysicalAddress eventAddress) {
        this.eventAddress = eventAddress;
    }
    
    public void setEventAuthor(UserEntity eventAuthor) {
    	this.eventAuthor = eventAuthor;
    }

    // TO STRING ------------------------------------------------------------------------

    @Override
	public String toString() {
		return "EventEntity [id=" + id + ", title=" + title + ", eventAddress=" + eventAddress 
				+ ", eventAuthor=" + eventAuthor + ", eventComments=" + eventComments + "]";
	}

    // HASH CODE AND EQUALS--------------------------------------------------------------

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        EventEntity other = (EventEntity) obj;
        return Objects.equals(id, other.id);
    }
    
}
