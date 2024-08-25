package com.example.uti.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.uti.model.Leito;
import com.example.uti.service.LeitoService;

@RestController
@RequestMapping("/leitos")
public class LeitoController {

        private LeitoService service = new LeitoService();

        @GetMapping
        public List<Leito> listarLeitos() throws Exception {
            return service.listarTodosOsLeitos();
        }

        @PostMapping
        public String cadastrarNovoLeito(@RequestBody Leito leito) throws Exception {
            return service.cadastrarNovoLeito(leito);
        }
}