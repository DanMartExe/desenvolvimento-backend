package org.programandoseufuturo.lojavirtual.service;

import java.util.List;
import java.util.Optional;
import org.programandoseufuturo.lojavirtual.model.Categoria;
import org.programandoseufuturo.lojavirtual.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService {

    private CategoriaRepository repository;

    @Autowired
    public CategoriaService (CategoriaRepository repository) {
        this.repository = repository;
    }

    public List<Categoria> obterCategoria() {
        return repository.findAll();
    }

    public Categoria obterCategoriaPeloId(int id) {
        return repository.getReferenceById(id);
    }

    public Categoria cadastrarNovaCategoria(Categoria categoria) {
        return repository.save(categoria);
    }

    public Categoria deletarCategoria(int id) {
        Optional<Categoria> optional = repository.findById(id);
        if (optional.isPresent()) {
            repository.deleteById(id);
            return optional.get();
        }
        throw new RuntimeException("Categoria não encontrada");
    }
}
