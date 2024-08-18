package com.example.lista02;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/app")
public class Lista02Application {

	private List<IlhaDeCalor> ilhasDeCalor = new ArrayList<>();

	@GetMapping("/ilhas-de-calor")
	public List<IlhaDeCalor> listarIlhasDeCalor() {
		return ilhasDeCalor;
	}

	public Boolean VerificarSeJaExisteIdBairro(IlhaDeCalor ilha) {
		for (IlhaDeCalor ilhaNaLista : ilhasDeCalor) {
			if (ilhaNaLista.getId() == ilha.getId()) {
				System.out.println("Erro: Id repetido");
				return false;
			}
		}
		return true;
	}

	@PostMapping("/ilhas-de-calor")
	public String adicionarIlhaDeCalor(@RequestBody IlhaDeCalor ilha) {
		if (!VerificarSeJaExisteIdBairro(ilha)) {
			return null;
		}
		ilhasDeCalor.add(ilha);
		return "ilha de calor " + ilha.getBairro() + " adicionada com sucesso!";
	}

	public static void main(String[] args) {
		SpringApplication.run(Lista02Application.class, args);
	}
}