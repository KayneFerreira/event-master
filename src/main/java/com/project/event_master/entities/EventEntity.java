package com.project.event_master.entities;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

import com.project.event_master.entities.enums.AccessType;

public class EventEntity {

    Long eventId;
    String title;
    String subDescription;
    String description;
    Integer capacity;
    PhysicalAddress eventAddress;
    LocalDate eventDate;
    LocalTime eventTime;
    Duration duration;
    BigDecimal price;
    AccessType accessType;
    String imageUrl;
    ArrayList<Comments> comments;

}
