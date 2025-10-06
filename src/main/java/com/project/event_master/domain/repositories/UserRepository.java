package com.project.event_master.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.event_master.domain.entities.UserEntity;


public interface UserRepository extends JpaRepository<UserEntity, Long> {

}
