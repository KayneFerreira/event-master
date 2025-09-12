package com.project.event_master.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.event_master.entities.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

}
