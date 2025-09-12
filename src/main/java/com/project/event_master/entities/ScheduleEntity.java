package com.project.event_master.entities;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Objects;

import com.project.event_master.entities.enums.Status;

public class ScheduleEntity {

    // ATTRIBUTES
    private Long scheduleId;
    private UserEntity organizer;
    private EventEntity event;
    private Instant createdAt;
    private Status status;
    private ArrayList<UserEntity> participants;

    // BUILDER PATTERN
    public static class Builder {

        private Long scheduleId;
        private UserEntity organizer;
        private EventEntity event;
        private Instant createdAt;
        private Status status;
        private ArrayList<UserEntity> participants;

        public Builder scheduleId(Long scheduleId) {
            this.scheduleId = scheduleId;
            return this;
        }

        public Builder organizer(UserEntity organizer) {
            this.organizer = organizer;
            return this;
        }

        public Builder event(EventEntity event) {
            this.event = event;
            return this;
        }

        public Builder createdAt(Instant createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder status(Status status) {
            this.status = status;
            return this;
        }

        public Builder participants(ArrayList<UserEntity> participants) {
            this.participants = participants;
            return this;
        }

        public ScheduleEntity build() {
            return new ScheduleEntity(this);
        }
    }

    // BUILDER CONSTRUCTORS
    public ScheduleEntity() {}
    public ScheduleEntity(Builder builder) {
        this.scheduleId = builder.scheduleId;
        this.organizer = builder.organizer;
        this.event = builder.event;
        this.createdAt = builder.createdAt;
        this.status = builder.status;
        this.participants = builder.participants;
    }

    // // DEFAULT CONSTRUCTORS
    // public ScheduleEntity() {}
    // public ScheduleEntity(Long id, UserEntity organizer, EventEntity event, Instant createdAt, Status status,
    //         ArrayList<UserEntity> participants) {
    //     this.id = id;
    //     this.organizer = organizer;
    //     this.event = event;
    //     this.createdAt = createdAt;
    //     this.status = status;
    //     this.participants = participants;
    // }

    // GETTERS & SETTERS
    public Long getId() {
        return scheduleId;
    }
    public void setId(Long scheduleId) {
        this.scheduleId = scheduleId;
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
        return "ScheduleEntity [id=" + scheduleId + ", organizer=" + organizer + ", event=" + event + ", createdAt=" + createdAt
                + ", status=" + status + ", participants=" + participants + "]";
    }

    // HASH CODE & EQUALS
    @Override
    public int hashCode() {
        return Objects.hash(scheduleId, organizer, event, createdAt, status, participants);
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
        return Objects.equals(scheduleId, other.scheduleId) && Objects.equals(organizer, other.organizer)
                && Objects.equals(event, other.event) && Objects.equals(createdAt, other.createdAt)
                && status == other.status && Objects.equals(participants, other.participants);
    }

}
