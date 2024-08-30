package com.example.lista03.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Pet {
    private int id;
    private String nome;
    private String especie;
    private boolean jaFoiAdotado;
}