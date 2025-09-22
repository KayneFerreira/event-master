package com.project.event_master.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonManagedReference;

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

    // ATTRIBUTES ------------------------------------------------------------------
    /*
        TODO:
            [ ] Fill attributes
                - Create getters and setters
                - Update constructors
                - Update toString
                - Update hashcode and equals
            [x] Create associations
                - Address
                - Comments
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @ManyToOne(cascade = CascadeType.ALL)
    private PhysicalAddress address;

    @OneToMany(
        mappedBy = "event", 
        cascade = CascadeType.ALL, 
        fetch = FetchType.LAZY
        )
    @JsonManagedReference
    private List<CommentEntity> comments = new ArrayList<>();

    // DEFAULT CONSTRUCTORS --------------------------------------------------------

    public EventEntity() {}

    // GETTERS AND SETTERS----------------------------------------------------------

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public PhysicalAddress getAddress() {
        return address;
    }

    public void setAddress(PhysicalAddress address) {
        this.address = address;
    }

    public List<CommentEntity> getComments() {
        return comments;
    }

    // TO STRING -------------------------------------------------------------------

    @Override
    public String toString() {
        return "EventEntity [id=" + id + ", title=" + title + ", address=" + address + "]";
    }

    // HASH CODE AND EQUALS---------------------------------------------------------

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
