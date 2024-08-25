package com.example.uti.service;

import java.util.List;
import com.example.uti.model.Leito;
import com.example.uti.repository.LeitoRepository;

public class LeitoService {
    private LeitoRepository repository = new LeitoRepository();

    public List<Leito> listarTodosOsLeitos() throws Exception {
        return repository.getAll();
    }

    public String cadastrarNovoLeito(Leito leito) throws Exception {
        if (repository.save(leito)) {
            return "Leito " + leito.getId() + " foi cadastrado com sucesso";
        }
        return "Leitos devem ter id unicos";
    }
}