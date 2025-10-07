package com.project.event_master.application.usecases.user;

import com.project.event_master.application.services.UserService;
import com.project.event_master.application.usecases.UseCase;

public class DeleteUserUseCase implements UseCase<Long, Void> {

    // DEPENDENCY INJECTION
    private UserService service;

    public DeleteUserUseCase(UserService service) {
        this.service = service;
    }

    public Void execute(Long id) {
        service.deleteUser(id);
        return null;
    }
}
