package com.example.revisao.repository;

import java.util.ArrayList;
import java.util.List;

import com.example.revisao.model.Caminhao;

public class CaminhaoRepository {
    // "banco de dados" mocado, uma lista:
    private List<Caminhao> caminhoes = new ArrayList<>();

    public List<Caminhao> getAll() {
        return caminhoes;
    }

    public boolean save(Caminhao caminhao) {
        for (Caminhao caminhaoNoBanco : caminhoes) {
            if (caminhao.getId() == caminhaoNoBanco.getId()) {
                return false;
            }
        }
        caminhoes.add(caminhao);
        return true;
    }
}