package com.example.playlist;

public class Musica {
    private int id;
    private String nome;
    private int duracaoEmSegundos;
    private boolean estaFavoritada;

    public Musica() {
    }

    public Musica(int id, String nome, int duracaoEmSegundos, boolean estaFavoritada) {
        this.id = id;
        this.nome = nome;
        this.duracaoEmSegundos = duracaoEmSegundos;
        this.estaFavoritada = estaFavoritada;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getDuracaoEmSegundos() {
        return duracaoEmSegundos;
    }

    public void setDuracaoEmSegundos(int duracaoEmSegundos) {
        this.duracaoEmSegundos = duracaoEmSegundos;
    }
    
    public boolean isEstaFavoritada() {
        return estaFavoritada;
    }

    public void setEstaFavoritada(boolean estaFavoritada) {
        this.estaFavoritada = estaFavoritada;
    }
}