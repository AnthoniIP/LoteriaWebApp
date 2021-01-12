package com.ipsoft.Loteria.controllers;

import com.ipsoft.Loteria.models.Sorteio;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class GetNumbers {


    public Sorteio randomNumber() {

        List<Integer> sorteador = new ArrayList<>();



        for(int i = 0; i < 7;i++) {
            Random rand = new Random();
            Integer numeroSorteado = rand.nextInt(100);
            sorteador.add(numeroSorteado);

        }


        Sorteio nSorteados = new Sorteio();
        nSorteados.setNumeros(sorteador);


        return nSorteados;
    }
}
