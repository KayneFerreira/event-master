package com.project.event_master.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

import com.project.event_master.domain.user.UserEntity;


public interface UserRepository extends JpaRepository<UserEntity, Long> {

    UserDetails findByUsername(String username);

}
