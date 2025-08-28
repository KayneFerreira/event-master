package com.project.event_master.entities.enums;

public enum Status {

    CONFIRMADO(1, "Confirmado"),
    ADIADO(2, "Adiado"),
    FINALIZADO(3, "Finalizado"),
    CANCELADO(4, "Cancelado");

    private final int code;
    private final String name;

    Status(int code, String name){
        this.code = code;
        this.name = name;
    }

    public int getCode(){
        return this.code;
    }

    public String getName(){
        return this.name;
    }

    public static Status getByCode(int code) {
        for(Status status : values()) {
            if(status.getCode() == code) {
                return status;
            }
        }
        throw new IllegalArgumentException("Código inválido: " + code);
    }
}
