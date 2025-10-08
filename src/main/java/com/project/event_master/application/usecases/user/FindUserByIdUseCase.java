package com.project.event_master.application.usecases.user;

import com.project.event_master.application.services.UserService;
import com.project.event_master.application.usecases.UseCase;
import com.project.event_master.dtos.user.UserResponseDTO;
import com.project.event_master.mappers.UserMapper;

public class FindUserByIdUseCase implements UseCase<Long, UserResponseDTO> {

    private final UserService service;
    private final UserMapper mapper;

    public FindUserByIdUseCase(UserService service, UserMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    public UserResponseDTO execute(Long id) {
        return mapper.toDto(service.findUserById(id));
    }

}
