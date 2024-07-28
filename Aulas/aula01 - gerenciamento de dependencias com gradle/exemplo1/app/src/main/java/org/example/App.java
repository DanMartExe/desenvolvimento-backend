package org.example;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class App {
    public static void main(String[] args) throws Exception {
        Vilao vilao = new Vilao(0, "Zabuza Momochi");

        ObjectMapper mapper = new ObjectMapper();

        mapper.writeValue(new File("viloes.json"), vilao);
    }
}