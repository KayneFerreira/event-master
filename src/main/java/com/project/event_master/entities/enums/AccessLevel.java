package com.project.event_master.entities.enums;

public enum AccessLevel {

    COMUM(1, "Usuário"),
    MODERADOR(2, "Moderador"),
    ADMINISTRADOR(3, "Administrador");

    private final int code;
    private final String name;

    AccessLevel(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public int getCode() {
        return this.code;
    }

    public String getName() {
        return this.name;
    }

    public static AccessLevel getByCode(int code) {
        for (AccessLevel level : values()) {
            if (level.getCode() == code) {
                return level;
            }
        }
        throw new IllegalArgumentException("Código inválido: " + code);
    }
}
