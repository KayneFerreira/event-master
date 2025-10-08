package com.project.event_master.application.usecases;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.project.event_master.application.usecases.comment.CommentUseCaseConfig;
import com.project.event_master.application.usecases.event.EventUseCaseConfig;
import com.project.event_master.application.usecases.user.UserUseCaseConfig;

@Configuration
@Import({
    UserUseCaseConfig.class, 
    EventUseCaseConfig.class,
    CommentUseCaseConfig.class
})
public class ApplicationUseCaseConfig {

}
