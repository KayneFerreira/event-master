package com.project.event_master.entities.enums;

public enum EventStatus {

    CONFIRMADO(1, "Confirmado"),
    ADIADO(2, "Adiado"),
    FINALIZADO(3, "Finalizado"),
    CANCELADO(4, "Cancelado");

    private int code;
    private String text;

    private EventStatus(int code, String text) {
        this.code = code;
        this.text = text;
    }

    public int getCode() {
        return code;
    }

    public String getText() {
        return text;
    }

    public static EventStatus fromCode(int code) {
        for (EventStatus status : EventStatus.values()) {
            if (status.code == code) {
                return status;
            }
        }
        throw new IllegalArgumentException("Código de acesso inválido: " + code);
    }

}
