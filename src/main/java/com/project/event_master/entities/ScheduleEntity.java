package com.project.event_master.entities;

import java.time.Instant;
import java.util.ArrayList;

import com.project.event_master.entities.enums.Status;

public class ScheduleEntity {

    Long id;
    UserEntity organizer;
    EventEntity event;
    Instant createdAt;
    Status status;
    ArrayList<UserEntity> participants;

}
