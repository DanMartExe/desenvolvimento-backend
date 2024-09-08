package com.example.ex01.controller;

import java.io.IOException;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.ex01.model.Obra;
import com.example.ex01.service.ObraService;

@RestController
@RequestMapping("obras")
public class ObraController {
    private ObraService obraService;

    public ObraController(ObraService obraService) {
        this.obraService = obraService;
    }

    @PostMapping
    public ResponseEntity<Obra> save(@RequestBody Obra obra) throws IOException {
        Obra obraCadastrada = obraService.cadastrarNovaObra(obra);

        if (obraCadastrada == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(obraCadastrada);
    }

    @GetMapping
    public ResponseEntity<List<Obra>> getAll() throws IOException {
        List<Obra> listarObras = obraService.listarObras();
        return ResponseEntity
            .status(HttpStatus.OK.value()).body(listarObras);
    }

    @PutMapping
    public ResponseEntity<Obra> update(@RequestBody Obra obra) throws IOException {
        Obra obraAtualizada = obraService.atualizarObra(obra);

        if (obraAtualizada == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

        return ResponseEntity.status(HttpStatus.OK).body(obraAtualizada);
    }

}
