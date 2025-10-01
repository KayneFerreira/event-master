package com.project.event_master.exceptions;

public class RecordNotFoundException extends RuntimeException {

    public RecordNotFoundException(String msg, Long id) {
        super(String.format("Registro não encontrado. %s ID: %d"));
    }
}
