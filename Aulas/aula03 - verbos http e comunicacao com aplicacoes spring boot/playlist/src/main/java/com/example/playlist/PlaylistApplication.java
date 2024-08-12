package com.example.playlist;

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
public class PlaylistApplication {

	private Playlist playlist = new Playlist();

	@GetMapping
	public List<Musica> getMusicas() {
		return playlist.getMusicas();
	}

	@GetMapping("/favoritadas")
	public List<Musica> getMusicasFavoritadas() {
		List <Musica> favotiradas = new ArrayList<>();
		
		for (Musica musica : playlist.getMusicas()) {
			if (musica.isEstaFavoritada()) {
				favotiradas.add(musica);
			}
		}
		return favotiradas;
	}

	@PostMapping
	public String adicionarMusica(@RequestBody Musica musica) {
		for (Musica musicaNaPlaylist : playlist.getMusicas()) {
			if (musica.getId() == musicaNaPlaylist.getId()) {
				return "A musica ja esta na playlist";
			}
		}

		playlist.adicionarMusica(musica);
		return "Musica incluida com sucesso!";
	}

	public static void main(String[] args) {
		SpringApplication.run(PlaylistApplication.class, args);
	}
}