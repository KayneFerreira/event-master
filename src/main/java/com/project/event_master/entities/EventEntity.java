package com.project.event_master.entities;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Objects;

import com.project.event_master.entities.enums.AccessType;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "events")
public class EventEntity {

    // ATTRIBUTES
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long eventId;
    
    private String title;
    private String subDescription;
    private String description;

    private Long capacity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "address_id")
    private PhysicalAddress eventAddress;

    private LocalDate eventDate;
    private LocalTime eventTime;
    private Duration duration;

    private BigDecimal price;
    private AccessType accessType;
    
    private String imageUrl;

    private ArrayList<Comments> comments;

    // BUILDER PATTERN
    public static class Builder {

        private Long eventId;
        private String title;
        private String subDescription;
        private String description;
        private Long capacity;
        private PhysicalAddress eventAddress;
        private LocalDate eventDate;
        private LocalTime eventTime;
        private Duration duration;
        private BigDecimal price;
        private AccessType accessType;
        private String imageUrl;
        private ArrayList<Comments> comments;

        public Builder eventId(Long eventId) {
            this.eventId = eventId;
            return this;
        }

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder subDescription(String subDescription) {
            this.subDescription = subDescription;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder capacity(Long capacity) {
            this.capacity = capacity;
            return this;
        }

        public Builder eventAddress(PhysicalAddress eventAddress) {
            this.eventAddress = eventAddress;
            return this;
        }

        public Builder eventDate(LocalDate eventDate) {
            this.eventDate = eventDate;
            return this;
        }

        public Builder eventTime(LocalTime eventTime) {
            this.eventTime = eventTime;
            return this;
        }

        public Builder duration(Duration duration) {
            this.duration = duration;
            return this;
        }

        public Builder price(BigDecimal price) {
            this.price = price;
            return this;
        }

        public Builder accessType(AccessType accessType) {
            this.accessType = accessType;
            return this;
        }

        public Builder imageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }

        public Builder comments(ArrayList<Comments> comments) {
            this.comments = comments;
            return this;
        }

        public EventEntity build() {
            return new EventEntity(this);
        }
    }

    // BUILDER CONSTRUCTORS
    private EventEntity(Builder builder) {
        this.eventId = builder.eventId;
        this.title = builder.title;
        this.subDescription = builder.subDescription;
        this.description = builder.description;
        this.capacity = builder.capacity;
        this.eventAddress = builder.eventAddress;
        this.eventDate = builder.eventDate;
        this.eventTime = builder.eventTime;
        this.duration = builder.duration;
        this.price = builder.price;
        this.accessType = builder.accessType;
        this.imageUrl = builder.imageUrl;
        this.comments = builder.comments;
    }

    // // DEFAULT CONSTRUCTORS
    // public EventEntity() {}
    // public EventEntity(Long eventId, String title, String subDescription, String description, 
    //         Integer capacity, PhysicalAddress eventAddress, LocalDate eventDate, 
    //         LocalTime eventTime, Duration duration, BigDecimal price, AccessType accessType, 
    //         String imageUrl, ArrayList<Comments> comments
    //         ) {
    //     this.eventId = eventId;
    //     this.title = title;
    //     this.subDescription = subDescription;
    //     this.description = description;
    //     this.capacity = capacity;
    //     this.eventAddress = eventAddress;
    //     this.eventDate = eventDate;
    //     this.eventTime = eventTime;
    //     this.duration = duration;
    //     this.price = price;
    //     this.accessType = accessType;
    //     this.imageUrl = imageUrl;
    //     this.comments = comments;
    // }

    // GETTERS & SETTERS
    public Long getEventId() {
        return eventId;
    }
    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getSubDescription() {
        return subDescription;
    }
    public void setSubDescription(String subDescription) {
        this.subDescription = subDescription;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Long getCapacity() {
        return capacity;
    }
    public void setCapacity(Long capacity) {
        this.capacity = capacity;
    }
    public PhysicalAddress getEventAddress() {
        return eventAddress;
    }
    public void setEventAddress(PhysicalAddress eventAddress) {
        this.eventAddress = eventAddress;
    }
    public LocalDate getEventDate() {
        return eventDate;
    }
    public void setEventDate(LocalDate eventDate) {
        this.eventDate = eventDate;
    }
    public LocalTime getEventTime() {
        return eventTime;
    }
    public void setEventTime(LocalTime eventTime) {
        this.eventTime = eventTime;
    }
    public Duration getDuration() {
        return duration;
    }
    public void setDuration(Duration duration) {
        this.duration = duration;
    }
    public BigDecimal getPrice() {
        return price;
    }
    public void setPrice(BigDecimal price) {
        this.price = price;
    }
    public AccessType getAccessType() {
        return accessType;
    }
    public void setAccessType(AccessType accessType) {
        this.accessType = accessType;
    }
    public String getImageUrl() {
        return imageUrl;
    }
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
    public ArrayList<Comments> getComments() {
        return comments;
    }
    public void setComments(ArrayList<Comments> comments) {
        this.comments = comments;
    }

    // TO STRING
    @Override
    public String toString() {
        return "EventEntity [eventId=" + eventId + ", title=" + title + ", subDescription=" + subDescription
                + ", description=" + description + ", capacity=" + capacity + ", eventAddress=" + eventAddress
                + ", eventDate=" + eventDate + ", eventTime=" + eventTime + ", duration=" + duration + ", price="
                + price + ", accessType=" + accessType + ", imageUrl=" + imageUrl + ", comments=" + comments + "]";
    }

    // HASH CODE & EQUALS
    @Override
    public int hashCode() {
        return Objects.hash(eventId, title, subDescription, description, capacity, eventAddress, eventDate, eventTime,
                duration, price, accessType, imageUrl, comments);
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
        return Objects.equals(eventId, other.eventId) && Objects.equals(title, other.title)
                && Objects.equals(subDescription, other.subDescription)
                && Objects.equals(description, other.description) && Objects.equals(capacity, other.capacity)
                && Objects.equals(eventAddress, other.eventAddress) && Objects.equals(eventDate, other.eventDate)
                && Objects.equals(eventTime, other.eventTime) && Objects.equals(duration, other.duration)
                && Objects.equals(price, other.price) && accessType == other.accessType
                && Objects.equals(imageUrl, other.imageUrl) && Objects.equals(comments, other.comments);
    }

}