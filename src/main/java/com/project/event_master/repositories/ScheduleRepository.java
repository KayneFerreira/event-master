package com.project.event_master.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.event_master.entities.ScheduleEntity;

public interface ScheduleRepository extends JpaRepository<ScheduleEntity, Long> {

}
