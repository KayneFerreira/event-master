package com.project.event_master.entities.enums;

public enum Stats {

    CONFIRMADO(1),
    ADIADO(2),
    FINALIZADO(3),
    CANCELADO(4);

    private final int code;

    Stats(int code){
        this.code = code;
    }

    public int getCode(){
        return code;
    }
}
