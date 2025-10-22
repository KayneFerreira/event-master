package com.project.event_master.application.usecases.user;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;

import com.project.event_master.application.services.UserService;
import com.project.event_master.mappers.UserMapper;
import com.project.event_master.security.jwt.TokenService;
import com.project.event_master.validation.CPFValidation;

@Configuration
public class UserUseCaseConfig {

    @Bean
    RegisterUserUseCase createUserUseCase(UserService service, UserMapper mapper, CPFValidation validation) {
        return new RegisterUserUseCase(service, mapper, validation);
    }

    @Bean
    FindAllUsersUseCase findAllUsersUseCase(UserService service, UserMapper mapper) {
        return new FindAllUsersUseCase(service, mapper);
    }

    @Bean
    FindUserByIdUseCase findUserByIdUseCase(UserService service, UserMapper mapper) {
        return new FindUserByIdUseCase(service, mapper);
    }
    
    @Bean
    UpdateUserUseCase updateUserUseCase(UserService service, UserMapper mapper, CPFValidation validation) {
        return new UpdateUserUseCase(service, mapper, validation);
    }

    @Bean
    DeleteUserUseCase deleteUserUseCase(UserService service) {
        return new DeleteUserUseCase(service);
    }
    
    @Bean
    FindUserByUsernameUseCase findUserByUsernameUseCase(UserService service, UserMapper mapper) {
        return new FindUserByUsernameUseCase(service, mapper);
    }
    
    @Bean
    AuthenticateUserUseCase authenticateUserUseCase(AuthenticationManager authManager, UserMapper mapper, TokenService tokenService) {
    	return new AuthenticateUserUseCase(authManager, mapper, tokenService);
    }

}
