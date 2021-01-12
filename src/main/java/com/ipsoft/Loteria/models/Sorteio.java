package com.ipsoft.Loteria.models;

import java.util.ArrayList;
import java.util.List;

public class Sorteio {

    private List<Integer> numeros;

    public Sorteio() {

    }

    public List<Integer> getNumeros() {
        return numeros;
    }

    public void setNumeros(List<Integer> numeros) {
        this.numeros = numeros;
    }

    @Override
    public String toString() {
        if(numeros != null) {
            return numeros.toString();
        }else {
            return "";
        }
    }
}
