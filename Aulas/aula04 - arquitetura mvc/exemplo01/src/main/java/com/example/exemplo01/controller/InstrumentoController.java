package com.example.exemplo01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.exemplo01.model.Instrumento;
import com.example.exemplo01.service.InstrumentoService;
import java.util.List;

@RestController
@RequestMapping("/instrumentos")
public class InstrumentoController {
    private InstrumentoService service = new InstrumentoService();

    @GetMapping
    public List<Instrumento> getAllInstrumentos() {
        return service.obterInstrumentosCadastrados();
    }

    @PostMapping
    public String cadastrarInstrumento(@RequestBody Instrumento instrumento) {
        return service.cadastrarInstrumento(instrumento);
    }
}