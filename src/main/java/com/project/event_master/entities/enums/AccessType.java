package com.project.event_master.entities.enums;

public enum AccessType {

    PUBLICO(1, "Público"),
    RESTRITO(2, "Restrito");

    private final int code;
    private final String name;

    AccessType(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public int getCode(){
        return code;
    }

    public String getName() {
        return name;
    }

    public static AccessType getByCode(int code) {
        for (AccessType type : values()) {
            if (type.getCode() == code) {
                return type;
            }
        }
        throw new IllegalArgumentException("Código inválido: " + code);
    }
}
