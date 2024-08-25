package com.example.revisao.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.revisao.model.Caminhao;
import com.example.revisao.service.CaminhaoService;

@RestController
@RequestMapping("/caminhoes")
public class CaminhaoController {
    private CaminhaoService service = new CaminhaoService();

    @GetMapping
    public List<Caminhao> listarCaminhoes() {
        return service.listarCaminhoes();
    }

    @PostMapping
    public String cadastrarNovoCaminhao(@RequestBody Caminhao caminhao) {
        return service.cadastrarNovoCaminhao(caminhao);
    }
}