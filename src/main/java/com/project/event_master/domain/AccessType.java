package com.project.event_master.domain;

public enum AccessType {

    PUBLICO(1, "Público"),
    RESTRITO(2, "Restrito");

    private int code;
    private String text;

    private AccessType(int code, String text) {
        this.code = code;
        this.text = text;
    }

    public int getCode() {
        return code;
    }

    public String getText() {
        return text;
    }

    public static AccessType fromCode(int code) {
        for (AccessType type : AccessType.values()) {
            if (type.code == code) {
                return type;
            }
        }
        throw new IllegalArgumentException("Código de acesso inválido: " + code);
    }

}
