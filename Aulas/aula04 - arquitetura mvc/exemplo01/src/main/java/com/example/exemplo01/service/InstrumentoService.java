package com.example.exemplo01.service;

import com.example.exemplo01.model.Instrumento;
import com.example.exemplo01.repository.InstrumentoRepository;
import java.util.List;

public class InstrumentoService {
    
    private InstrumentoRepository repository = new InstrumentoRepository();

    public String cadastrarInstrumento(Instrumento instrumento) {
        for (Instrumento instrumentoNaLista : repository.getAll()) {
            if (instrumento.getId() == instrumentoNaLista.getId()) {
                return "Id já cadastrado!";
            }
        }
        repository.save(instrumento);
        return "Instrumento " + instrumento.getNome() + " cadastrado com sucesso!";
    }

    public List<Instrumento> obterInstrumentosCadastrados() {
        return repository.getAll();
    }
}