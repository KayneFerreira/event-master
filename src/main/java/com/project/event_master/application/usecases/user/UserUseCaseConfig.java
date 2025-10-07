package com.project.event_master.application.usecases.user;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.project.event_master.application.services.UserService;
import com.project.event_master.mappers.UserMapper;
import com.project.event_master.validation.CPFValidation;

@Configuration
public class UserUseCaseConfig {

    @Bean
    public CreateUserUseCase createUserUseCase(UserService service, UserMapper mapper, CPFValidation validation) {
        return new CreateUserUseCase(service, mapper, validation);
    }

    @Bean
    public FindAllUsersUseCase findAllUsersUseCase(UserService service, UserMapper mapper) {
        return new FindAllUsersUseCase(service, mapper);
    }

    @Bean
    public FindUserByIdUseCase findUserByIdUseCase(UserService service, UserMapper mapper) {
        return new FindUserByIdUseCase(service, mapper);
    }

    @Bean
    public UpdateUserUseCase updateUserUseCase(UserService service, UserMapper mapper, CPFValidation validation) {
        return new UpdateUserUseCase(service, mapper, validation);
    }

    @Bean
    public DeleteUserUseCase deleteUserUseCase(UserService service) {
        return new DeleteUserUseCase(service);
    }

}
