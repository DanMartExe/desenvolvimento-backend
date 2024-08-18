package com.example.psflix.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.psflix.model.Midia;
import com.example.psflix.service.MidiaService;

@RestController
@RequestMapping("/midias") // nome da classe no plural
public class MidiaController {
    private MidiaService midiaService = new MidiaService();

    @GetMapping
    public List<Midia> getAll() {
        return midiaService.obterMidiasCadastradas();
    }

    @PostMapping
    public String salvarMidia(@RequestBody Midia midia) {
        return midiaService.cadastrarNovaMidia(midia);
    }
}