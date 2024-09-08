package com.example.ex01.repository;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;
import com.example.ex01.model.Obra;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class ObraRepository {
    private static final int ZERO_BYTE = 0;
    private ObjectMapper objectMapper = new ObjectMapper();
    private File arquivo = new File("src/main/resources/database/tb_obras.json");

    public List<Obra> getAll() throws IOException {
        if (!arquivo.exists()) {
            arquivo.createNewFile();
        }

        if (arquivo.length() > ZERO_BYTE) {
            return objectMapper
                .readValue(arquivo, new TypeReference<List<Obra>>(){});
        }
        return new ArrayList<>();
    }

    public boolean save(Obra obra) throws IOException {
        List<Obra> obras = this.getAll();

        for (Obra obraNoDataBase : obras) {
            if (obraNoDataBase.getId() == obra.getId()) {
                return false;
            }
        }
        
        obras.add(obra);
        objectMapper.writeValue(arquivo, obras);
        return true;
    }

    public boolean update(Obra obra) throws IOException {
        List<Obra> obras = this.getAll();

        for (Obra obraNoDataBase : obras) {
            if (obraNoDataBase.getId() == obra.getId()) {
                obraNoDataBase.setNome(obra.getNome());
                obraNoDataBase.setAutor(obra.getAutor());
                obraNoDataBase.setPreco(obra.getPreco());
                obraNoDataBase.setJaFoiVendida(obra.isJaFoiVendida());

                objectMapper.writeValue(arquivo, obras);
                return true;
            }
        }
        return false;
    }
}
