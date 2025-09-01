package com.project.event_master.entities;

import java.time.Instant;
import java.util.ArrayList;

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
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((organizer == null) ? 0 : organizer.hashCode());
        result = prime * result + ((event == null) ? 0 : event.hashCode());
        result = prime * result + ((createdAt == null) ? 0 : createdAt.hashCode());
        result = prime * result + ((status == null) ? 0 : status.hashCode());
        result = prime * result + ((participants == null) ? 0 : participants.hashCode());
        return result;
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
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (organizer == null) {
            if (other.organizer != null)
                return false;
        } else if (!organizer.equals(other.organizer))
            return false;
        if (event == null) {
            if (other.event != null)
                return false;
        } else if (!event.equals(other.event))
            return false;
        if (createdAt == null) {
            if (other.createdAt != null)
                return false;
        } else if (!createdAt.equals(other.createdAt))
            return false;
        if (status != other.status)
            return false;
        if (participants == null) {
            if (other.participants != null)
                return false;
        } else if (!participants.equals(other.participants))
            return false;
        return true;
    }

}
