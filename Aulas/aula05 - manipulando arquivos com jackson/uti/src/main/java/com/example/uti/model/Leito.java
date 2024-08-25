package com.example.uti.model;

public class Leito {
    private int id;
    private int numeroQuarto;
    private boolean estaOcupado;
    
    public Leito() {
    }
    
    public Leito(int id, int numeroQuarto, boolean estaOcupado) {
        this.id = id;
        this.numeroQuarto = numeroQuarto;
        this.estaOcupado = estaOcupado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumeroQuarto() {
        return numeroQuarto;
    }

    public void setNumeroQuarto(int numeroQuarto) {
        this.numeroQuarto = numeroQuarto;
    }

    public boolean isEstaOcupado() {
        return estaOcupado;
    }

    public void setEstaOcupado(boolean estaOcupado) {
        this.estaOcupado = estaOcupado;
    }
}