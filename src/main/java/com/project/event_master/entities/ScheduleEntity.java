package com.project.event_master.entities;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Objects;

import com.project.event_master.entities.enums.Status;

public class ScheduleEntity {

    // ATTRIBUTES
    private Long id;
    private UserEntity organizer;
    private EventEntity event;
    private Instant createdAt;
    private Status status;
    private ArrayList<UserEntity> participants;

    // CONSTRUCTORS
    public ScheduleEntity() {}
    public ScheduleEntity(Long id, UserEntity organizer, EventEntity event, Instant createdAt, Status status,
            ArrayList<UserEntity> participants) {
        this.id = id;
        this.organizer = organizer;
        this.event = event;
        this.createdAt = createdAt;
        this.status = status;
        this.participants = participants;
    }

    // GETTERS & SETTERS
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public UserEntity getOrganizer() {
        return organizer;
    }
    public void setOrganizer(UserEntity organizer) {
        this.organizer = organizer;
    }
    public EventEntity getEvent() {
        return event;
    }
    public void setEvent(EventEntity event) {
        this.event = event;
    }
    public Instant getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }
    public Status getStatus() {
        return status;
    }
    public void setStatus(Status status) {
        this.status = status;
    }
    public ArrayList<UserEntity> getParticipants() {
        return participants;
    }
    public void setParticipants(ArrayList<UserEntity> participants) {
        this.participants = participants;
    }
    
    // TO STRING
    @Override
    public String toString() {
        return "ScheduleEntity [id=" + id + ", organizer=" + organizer + ", event=" + event + ", createdAt=" + createdAt
                + ", status=" + status + ", participants=" + participants + "]";
    }

    // HASH CODE & EQUALS
    @Override
    public int hashCode() {
        return Objects.hash(id, organizer, event, createdAt, status, participants);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ScheduleEntity other = (ScheduleEntity) obj;
        return Objects.equals(id, other.id) && Objects.equals(organizer, other.organizer)
                && Objects.equals(event, other.event) && Objects.equals(createdAt, other.createdAt)
                && status == other.status && Objects.equals(participants, other.participants);
    }

}
