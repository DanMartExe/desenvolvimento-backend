package com.example.revisao.service;

import com.example.revisao.repository.CaminhaoRepository;
import com.example.revisao.model.Caminhao;
import java.util.List;

public class CaminhaoService {
    private CaminhaoRepository repository = new CaminhaoRepository();

    public List<Caminhao> listarCaminhoes() {
        return repository.getAll();
    }

    public String cadastrarNovoCaminhao(Caminhao caminhao) {
        if (repository.save(caminhao)) {
            return "Caminhao de modelo " + caminhao.getModelo() + " foi cadastrado com sucesso";
        }

        return "Caminhoes devem ter id unico";
    }
}