package com.ipsoft.Loteria.models;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private String email;
    private List<Integer> sorteios = new ArrayList<>();

    public Cliente(String email) {

        this.email = email;
    }

    public List<Integer> getSorteios() {
        return sorteios;
    }

    public void setSorteios(List<Integer> sorteios) {
        this.sorteios = sorteios;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return this.email;
    }
}
