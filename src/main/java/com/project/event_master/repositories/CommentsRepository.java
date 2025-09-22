package com.project.event_master.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.event_master.entities.CommentEntity;

public interface CommentsRepository extends JpaRepository<CommentEntity, Long>{

    List<CommentEntity> findByEventId(Long eventId);

}
