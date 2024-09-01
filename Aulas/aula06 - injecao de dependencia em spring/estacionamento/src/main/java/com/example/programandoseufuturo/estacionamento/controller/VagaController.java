package com.example.programandoseufuturo.estacionamento.controller;

import java.io.IOException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.programandoseufuturo.estacionamento.model.Vaga;
import com.example.programandoseufuturo.estacionamento.service.VagaService;

@RestController //tem Component dentro dessa classe
@RequestMapping("/vagas")
public class VagaController {

    private VagaService vagaService;

    @Autowired
    public VagaController(VagaService vagaService) {
        this.vagaService = vagaService;
    }

    @GetMapping
    // ResponseEntity classe generica q permite manipular retorno de status code
    public ResponseEntity<List<Vaga>> getAll() throws IOException {
        List<Vaga> listaVagas = vagaService.listarVagas();
        return ResponseEntity
            .status(HttpStatus.OK.value()).body(listaVagas);
    }

    @PostMapping
    public ResponseEntity<Vaga> cadastrarNovaVaga(@RequestBody Vaga vaga) throws IOException {
        Vaga vagaCadastrada = vagaService.save(vaga);

        if (vagaCadastrada == null) {
            return ResponseEntity
                //build retorna um 'corpo vazio", apenas o status code
                .status(HttpStatus.BAD_REQUEST).build();
        }
        return ResponseEntity
            .status(HttpStatus.CREATED).body(vagaCadastrada);
    }

    @PutMapping
    public ResponseEntity<Vaga> update(@RequestBody Vaga vaga) throws IOException {
        Vaga vagaAtualizada = vagaService.update(vaga);

        if (vagaAtualizada == null) {
            return ResponseEntity
                .status(HttpStatus.BAD_REQUEST).build();
        }

        return ResponseEntity
            .status(HttpStatus.OK).body(vagaAtualizada);
    }
}
