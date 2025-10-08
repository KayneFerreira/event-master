package com.project.event_master.application.usecases.user;

import java.util.List;
import java.util.stream.Collectors;

import com.project.event_master.application.services.UserService;
import com.project.event_master.application.usecases.UseCase;
import com.project.event_master.dtos.user.UserResponseDTO;
import com.project.event_master.mappers.UserMapper;

public class FindAllUsersUseCase implements UseCase<Void, List<UserResponseDTO>> {

    private final UserService service;
    private final UserMapper mapper;

    public FindAllUsersUseCase(UserService service, UserMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    public List<UserResponseDTO> execute(Void input) {
        return service.findAllUsers()
                        .stream()
                        .map(user -> mapper.toDto(user))
                        .collect(Collectors.toList());
    }

}
