package com.example.ex01.model;

import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Obra {

    private int id;
    private String nome;
    private String autor;
    private BigDecimal preco;

    @JsonProperty("ja_foi_vendida")
    private boolean jaFoiVendida;
}