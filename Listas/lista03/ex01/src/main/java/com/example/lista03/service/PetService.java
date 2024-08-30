package com.example.lista03.service;

import com.example.lista03.model.Pet;
import com.example.lista03.repository.PetRepository;

import java.util.List;

public class PetService {
    private PetRepository repository = new PetRepository();

    public List<Pet> listarPets() throws Exception {
        return repository.getAll();
    }

    public String cadastrarNovoPet(Pet pet) throws Exception {
        if (repository.save(pet)) {
            return "O pet " + pet.getNome() + ", de id " + pet.getId() +
                    ", foi cadastrado com sucesso!";
        }
        return "Os pets não podem ter id repetido";
    }
}