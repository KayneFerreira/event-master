package com.project.event_master.entities;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Objects;

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