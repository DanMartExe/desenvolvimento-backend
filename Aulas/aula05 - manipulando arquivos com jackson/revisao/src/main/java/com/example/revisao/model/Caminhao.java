package com.example.revisao.model;

import com.example.revisao.enums.TamanhoCaminhao;

public class Caminhao {
    private int id;
    private String modelo;
    private TamanhoCaminhao tamanhoCaminhao;

    public Caminhao() {
    }

    public Caminhao(int id, String modelo, TamanhoCaminhao tamanhoCaminhao) {
        this.id = id;
        this.modelo = modelo;
        this.tamanhoCaminhao = tamanhoCaminhao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public TamanhoCaminhao getTamanhoCaminhao() {
        return tamanhoCaminhao;
    }

    public void setTamanhoCaminhao(TamanhoCaminhao tamanhoCaminhao) {
        this.tamanhoCaminhao = tamanhoCaminhao;
    }
}