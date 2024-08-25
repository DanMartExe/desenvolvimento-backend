package com.example.uti.repository;

import java.util.ArrayList;
import java.util.List;
import java.io.File;

import com.example.uti.model.Leito;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class LeitoRepository {
    private static final int ZERO_BYTES = 0;
    // classe File representa o conceito de arquivo, manipulando
    private File arquivo = new File("src/main/resources/database/tb_leitos.json");
    // classe usada p/ mapear objetos p json, ou json p objetos (faz em outros formatos também):
    private ObjectMapper objectMapper = new ObjectMapper();

    public List<Leito> getAll() throws Exception {
        // validação importante... não tentar abrir arquivos sem saber se existe:
        if (!arquivo.exists()) {
            arquivo.createNewFile();
        }

        List<Leito> leitos = null;
        // outra validação importante
        if (arquivo.length() > ZERO_BYTES) {
            leitos = objectMapper.readValue(arquivo,
                new TypeReference<ArrayList<Leito>>() {});
        } else {
            leitos = new ArrayList<>();
        }

        return leitos;
    }

    public boolean save(Leito leito) throws Exception {
        List<Leito> leitos = this.getAll();

        for (Leito leitoNoBanco : leitos) {
            if (leitoNoBanco.getId() == leito.getId()) {
                return false;
            }
        }

        leitos.add(leito);
        objectMapper.writeValue(arquivo, leitos);
        return true;
    }
}