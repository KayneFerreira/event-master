package com.project.event_master.domain.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.event_master.domain.entities.CommentEntity;

public interface CommentRepository extends JpaRepository<CommentEntity, Long>{

    List<CommentEntity> findByEventId(Long eventId);

}

