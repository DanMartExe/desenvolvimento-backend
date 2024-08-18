package com.example.psflix.model;

public class Midia {
    private int id;
    private String titulo;
    private String categoria;
    
    public Midia() {
    }

    public Midia(int id, String titulo, String categoria) {
        this.id = id;
        this.titulo = titulo;
        this.categoria = categoria;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}