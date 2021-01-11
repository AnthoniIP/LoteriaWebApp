package com.ipsoft.Loteria.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class GetNumberController {

    @GetMapping(path = "/randomNumber")
    public String randomNumber() {

        Random rand = new Random();
        Integer numeroSorteado = rand.nextInt(100);

        return numeroSorteado.toString();
    }
}
