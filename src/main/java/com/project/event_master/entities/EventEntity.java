package com.project.event_master.entities;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

import com.project.event_master.entities.enums.AccessType;

public class EventEntity {

    // ATTRIBUTES
    private Long eventId;
    private String title;
    private String subDescription;
    private String description;
    private Integer capacity;
    private PhysicalAddress eventAddress;
    private LocalDate eventDate;
    private LocalTime eventTime;
    private Duration duration;
    private BigDecimal price;
    private AccessType accessType;
    private String imageUrl;
    private ArrayList<Comments> comments;

    // CONSTRUCTORS
    public EventEntity() {}
    public EventEntity(Long eventId, String title, String subDescription, String description, 
            Integer capacity, PhysicalAddress eventAddress, LocalDate eventDate, 
            LocalTime eventTime, Duration duration, BigDecimal price, AccessType accessType, 
            String imageUrl, ArrayList<Comments> comments
            ) {
        this.eventId = eventId;
        this.title = title;
        this.subDescription = subDescription;
        this.description = description;
        this.capacity = capacity;
        this.eventAddress = eventAddress;
        this.eventDate = eventDate;
        this.eventTime = eventTime;
        this.duration = duration;
        this.price = price;
        this.accessType = accessType;
        this.imageUrl = imageUrl;
        this.comments = comments;
    }

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
    public Integer getCapacity() {
        return capacity;
    }
    public void setCapacity(Integer capacity) {
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
        final int prime = 31;
        int result = 1;
        result = prime * result + ((eventId == null) ? 0 : eventId.hashCode());
        result = prime * result + ((title == null) ? 0 : title.hashCode());
        result = prime * result + ((subDescription == null) ? 0 : subDescription.hashCode());
        result = prime * result + ((description == null) ? 0 : description.hashCode());
        result = prime * result + ((capacity == null) ? 0 : capacity.hashCode());
        result = prime * result + ((eventAddress == null) ? 0 : eventAddress.hashCode());
        result = prime * result + ((eventDate == null) ? 0 : eventDate.hashCode());
        result = prime * result + ((eventTime == null) ? 0 : eventTime.hashCode());
        result = prime * result + ((duration == null) ? 0 : duration.hashCode());
        result = prime * result + ((price == null) ? 0 : price.hashCode());
        result = prime * result + ((accessType == null) ? 0 : accessType.hashCode());
        result = prime * result + ((imageUrl == null) ? 0 : imageUrl.hashCode());
        result = prime * result + ((comments == null) ? 0 : comments.hashCode());
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
        EventEntity other = (EventEntity) obj;
        if (eventId == null) {
            if (other.eventId != null)
                return false;
        } else if (!eventId.equals(other.eventId))
            return false;
        if (title == null) {
            if (other.title != null)
                return false;
        } else if (!title.equals(other.title))
            return false;
        if (subDescription == null) {
            if (other.subDescription != null)
                return false;
        } else if (!subDescription.equals(other.subDescription))
            return false;
        if (description == null) {
            if (other.description != null)
                return false;
        } else if (!description.equals(other.description))
            return false;
        if (capacity == null) {
            if (other.capacity != null)
                return false;
        } else if (!capacity.equals(other.capacity))
            return false;
        if (eventAddress == null) {
            if (other.eventAddress != null)
                return false;
        } else if (!eventAddress.equals(other.eventAddress))
            return false;
        if (eventDate == null) {
            if (other.eventDate != null)
                return false;
        } else if (!eventDate.equals(other.eventDate))
            return false;
        if (eventTime == null) {
            if (other.eventTime != null)
                return false;
        } else if (!eventTime.equals(other.eventTime))
            return false;
        if (duration == null) {
            if (other.duration != null)
                return false;
        } else if (!duration.equals(other.duration))
            return false;
        if (price == null) {
            if (other.price != null)
                return false;
        } else if (!price.equals(other.price))
            return false;
        if (accessType != other.accessType)
            return false;
        if (imageUrl == null) {
            if (other.imageUrl != null)
                return false;
        } else if (!imageUrl.equals(other.imageUrl))
            return false;
        if (comments == null) {
            if (other.comments != null)
                return false;
        } else if (!comments.equals(other.comments))
            return false;
        return true;
    }
}
