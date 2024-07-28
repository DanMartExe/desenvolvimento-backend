package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Vilao {
    private int id;

    @JsonProperty("nome_completo")
    private String nomeCompleto;

    public Vilao(int id, String nomeCompleto) {
        this.id = id;
        this.nomeCompleto = nomeCompleto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }
}