package com.project.event_master.domain.enums;

public enum UserRoles {

    ROLE_USER(1, "Usuário"),
    ROLE_ADMIN(2, "Administrador");

    private int code;
    private String text;

    private UserRoles(int code, String text) {
        this.code = code;
        this.text = text;
    }

    public int getCode() {
        return code;
    }

    public String getText() {
        return text;
    }

    public static UserRoles fromCode(int code) {
        for (UserRoles level : UserRoles.values()) {
            if (level.code == code) {
                return level;
            }
        }
        throw new IllegalArgumentException("Código de acesso inválido: " + code);
    }
}
