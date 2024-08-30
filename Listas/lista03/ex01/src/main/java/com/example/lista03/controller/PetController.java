package com.example.lista03.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import com.example.lista03.model.Pet;
import com.example.lista03.service.PetService;

@RestController
@RequestMapping("/pets")
public class PetController {
    private PetService service = new PetService();

    @GetMapping
    public List<Pet> listarPets() throws Exception {
        return service.listarPets();
    }

    @PostMapping
    public String cadastrarPet(@RequestBody Pet pet) throws Exception {
        return service.cadastrarNovoPet(pet);
    }
}