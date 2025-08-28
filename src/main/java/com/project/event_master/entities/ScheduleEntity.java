package com.project.event_master.entities;

import java.time.Instant;
import java.util.ArrayList;

import com.project.event_master.entities.enums.Stats;

public class ScheduleEntity {

    Long id;
    UserEntity organizer;
    EventEntity event;
    Instant createdAt;
    Stats status;
    ArrayList<UserEntity> participants;

}
