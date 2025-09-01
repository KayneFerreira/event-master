package com.project.event_master.entities.enums;

public enum State {

    // Região Norte
    ACRE(1, "AC", "Acre"),
    AMAPA(2, "AP", "Amapá"),
    AMAZONAS(3, "AM", "Amazonas"),
    PARA(4, "PA", "Pará"),
    RONDONIA(5, "RO", "Rondônia"),
    RORAIMA(6, "RR", "Roraima"),
    TOCANTINS(7, "TO", "Tocantins"),

    // Região Nordeste
    ALAGOAS(8, "AL", "Alagoas"),
    BAHIA(9, "BA", "Bahia"),
    CEARA(10, "CE", "Ceará"),
    MARANHAO(11, "MA", "Maranhão"),
    PARAIBA(12, "PB", "Paraíba"),
    PERNAMBUCO(13, "PE", "Pernambuco"),
    PIAUI(14, "PI", "Piauí"),
    RIO_GRANDE_DO_NORTE(15, "RN", "Rio Grande do Norte"),
    SERGIPE(16, "SE", "Sergipe"),

    // Região Centro-Oeste
    DISTRITO_FEDERAL(17, "DF", "Distrito Federal"),
    GOIAS(18, "GO", "Goiás"),
    MATO_GROSSO(19, "MT", "Mato Grosso"),
    MATO_GROSSO_DO_SUL(20, "MS", "Mato Grosso do Sul"),

    // Região Sudeste
    ESPIRITO_SANTO(21, "ES", "Espírito Santo"),
    MINAS_GERAIS(22, "MG", "Minas Gerais"),
    RIO_DE_JANEIRO(23, "RJ", "Rio de Janeiro"),
    SAO_PAULO(24, "SP", "São Paulo"),

    // Região Sul
    PARANA(25, "PR", "Paraná"),
    RIO_GRANDE_DO_SUL(26, "RS", "Rio Grande do Sul"),
    SANTA_CATARINA(27, "SC", "Santa Catarina");

    private final int code;
    private final String acronym;
    private final String name;

    State(int code, String acronym, String name) {
        this.code = code;
        this.acronym = acronym;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public String getAcronym() {
        return acronym;
    }

    public String getName() {
        return name;
    }

    public static State getByCode(int code) {
        for (State state : values()) {
            if (state.getCode() == code) {
                return state;
            }
        }
        throw new IllegalArgumentException("Código inválido: " + code);
    }

}
