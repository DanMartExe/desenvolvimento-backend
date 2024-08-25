package com.example.uti.service;

import java.util.List;

import com.example.uti.model.Medico;
import com.example.uti.repository.MedicoRepository;

public class MedicoService {
    private MedicoRepository repository = new MedicoRepository();

    public List<Medico> listarMedicos() throws Exception {
        return repository.getAll();
    }

    public String cadastrarNovoMedico(Medico medico) throws Exception {
        if (repository.save(medico)) {
            return "Medico " + medico.getNome() + " foi cadastrado com sucesso";
        }
        return "Medicos devem ter CRM único";
    }
}