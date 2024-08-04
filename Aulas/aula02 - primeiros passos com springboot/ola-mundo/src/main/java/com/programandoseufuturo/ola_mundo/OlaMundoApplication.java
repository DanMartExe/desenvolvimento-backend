package com.programandoseufuturo.ola_mundo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

// habilita a classe abaixo a receber requisições
@RestController
// definite uma rota
@RequestMapping("/app")
public class OlaMundoApplication {

	// toda requisição p/ rota abaixo, encontrará o metódo:
	@GetMapping("/ola-mundo")
	public String olaMundo() {
		return "<h1>Olá, mundo!</h1>";
	}

	@GetMapping("/tchau")
	public String tchau() {
		return "tchau!";
	}

	// simples, porém, uma das piores formas de passar variáveis
	@GetMapping("/nome/{nome}")
	public String cumprimentar(@PathVariable String nome) {
		return "<h1>Olá, " + nome + "</h1>";
	}

	//exercicio:
	@GetMapping("/idade/{idade}")
	public String isMaiorDeIdade(@PathVariable String idade) {
		if (Integer.parseInt(idade) >= 18) {
			return "É maior de idade";
		}
		return "É menor de idade";
	}

	public static void main(String[] args) {
		SpringApplication.run(OlaMundoApplication.class, args);
	}
}
