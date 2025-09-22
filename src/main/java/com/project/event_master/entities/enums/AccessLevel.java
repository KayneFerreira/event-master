package com.project.event_master.entities.enums;

public enum AccessLevel {

    USUARIO(1, "Usuário"),
    MODERADOR(2, "Moderador"),
    ADMINISTRADOR(3, "Administrador");

    private int code;
    private String text;

    private AccessLevel(int code, String text) {
        this.code = code;
        this.text = text;
    }

    public int getCode() {
        return code;
    }

    public String getText() {
        return text;
    }

    public static AccessLevel fromCode(int code) {
        for (AccessLevel level : AccessLevel.values()) {
            if (level.code == code) {
                return level;
            }
        }
        throw new IllegalArgumentException("Código de acesso inválido: " + code);
    }
}
