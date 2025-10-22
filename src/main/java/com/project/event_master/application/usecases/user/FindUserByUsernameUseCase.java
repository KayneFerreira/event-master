package com.project.event_master.application.usecases.user;

import com.project.event_master.application.services.UserService;
import com.project.event_master.application.usecases.UseCase;
import com.project.event_master.dtos.user.UserResponseDTO;
import com.project.event_master.mappers.UserMapper;

public class FindUserByUsernameUseCase implements UseCase<String, UserResponseDTO> {

    private final UserService service;
    private final UserMapper mapper;

    public FindUserByUsernameUseCase(UserService service, UserMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    public UserResponseDTO execute(String username) {
        return mapper.toDto(service.findUserByUsername(username));
    }

}
