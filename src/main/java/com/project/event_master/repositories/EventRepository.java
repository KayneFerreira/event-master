package com.project.event_master.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.event_master.domain.EventEntity;

public interface EventRepository extends JpaRepository<EventEntity, Long> {

}
