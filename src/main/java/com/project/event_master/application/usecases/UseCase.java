package com.project.event_master.application.usecases;

public interface UseCase<I, O> {
    O execute(I input);
}
