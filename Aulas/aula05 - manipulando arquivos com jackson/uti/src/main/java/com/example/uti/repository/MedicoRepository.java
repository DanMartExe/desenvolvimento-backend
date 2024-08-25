package com.example.uti.repository;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.example.uti.model.Medico;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;


public class MedicoRepository {
    private static final int ZERO_BYTES = 0;
    private static File arquivo =
        new File("src/main/resources/database/tb_medicos.json");

    private ObjectMapper objectMapper = new ObjectMapper();

    public List<Medico> getAll() throws Exception {
        if (!arquivo.exists()) {
            arquivo.createNewFile();
        }

        if (arquivo.length() > ZERO_BYTES) {
            return objectMapper.readValue(arquivo,
                new TypeReference<ArrayList<Medico>>() {});
        }

        return new ArrayList<>();
    }

    public boolean save(Medico medico) throws Exception {
        List<Medico> medicos = this.getAll();

        for (Medico medicoNoDatabase : medicos) {
            if (medico.getCrm() == medicoNoDatabase.getCrm()) {
                return false;
            }
        }

        medicos.add(medico);
        objectMapper.writeValue(arquivo, medicos);
        return true;
    }
}