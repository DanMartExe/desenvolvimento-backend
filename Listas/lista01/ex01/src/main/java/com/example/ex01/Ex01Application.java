package com.example.ex01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/app")
public class Ex01Application {
	
	@GetMapping("/{senha}")
	public String validarEntrada(@PathVariable String senha) {
		String senhaSistema = "senha123";
		
		if (senhaSistema.equals(senha)) {
			return "Entrada autorizada";
		}
		return "Entrada não autorizada";
	}

	public static void main(String[] args) {
		SpringApplication.run(Ex01Application.class, args);
	}
}