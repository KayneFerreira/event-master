package com.project.event_master.domain.user;

public enum AccessLevel {

    USER(1, "Usuário"),
    MOD(2, "Moderador"),
    ADMIN(3, "Administrador");

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
