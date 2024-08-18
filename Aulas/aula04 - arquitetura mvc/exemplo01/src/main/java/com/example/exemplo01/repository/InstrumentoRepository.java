package com.example.exemplo01.repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import com.example.exemplo01.model.Instrumento;

public class InstrumentoRepository {

    // dados mocados (por enquanto):
    private List<Instrumento> instrumentos = new ArrayList<>();

    public InstrumentoRepository() {
        instrumentos
        .add(new Instrumento(1, "Trompete", new BigDecimal(2499.99)));

        instrumentos
        .add(new Instrumento(2, "Guitarra", new BigDecimal(3279.00)));
    }

    public void save(Instrumento instrumento) {
        instrumentos.add(instrumento);
    }

    public List<Instrumento> getAll() {
        return instrumentos;
    }

    // como seria persistindo:
    // public void save(Instrumento Instrumento) {
    // // comunicação com banco
    // // envio de intrumento para persistencia
    // }
}