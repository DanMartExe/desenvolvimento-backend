package com.example.psflix.service;

import java.util.List;
import com.example.psflix.model.Midia;
import com.example.psflix.repository.MidiaRepository;

public class MidiaService {
    private MidiaRepository repository = new MidiaRepository();

    public List<Midia> obterMidiasCadastradas() {
        return repository.getAll();
    }

    public String cadastrarNovaMidia(Midia midia) {
        if (midia.getTitulo() == null || midia.getTitulo().isBlank()) {
            return "Titulo inválido!";
        }

        repository.save(midia);
        return "Midia " + midia.getTitulo() + " cadastrada com sucesso!";
    }
}