package com.example.ex02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/app")
public class Ex02Application {
	
	@GetMapping("/{quilometragem}")
	public String calcularPrecoDaViagem(@PathVariable String quilometragem) {
		Double precoDaViagem = Double.parseDouble(quilometragem) * 25;

		return "O preco final de sua expedicao eh: " + precoDaViagem;
	}

	public static void main(String[] args) {
		SpringApplication.run(Ex02Application.class, args);
	}
}