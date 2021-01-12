package com.ipsoft.Loteria.models.repository;

import com.ipsoft.Loteria.models.Cliente;
import com.ipsoft.Loteria.models.Sorteio;

import java.util.ArrayList;
import java.util.List;

public class MemoryRepository implements Repository {

    private List<Cliente> clientes = new ArrayList<>();

    private MemoryRepository(){

    };


    @Override
    public void add(Cliente cliente) {
        clientes.add(cliente);

    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    //singleton
    public static MemoryRepository getInstance() {
         MemoryRepository memoryRepository = null;
         if(memoryRepository == null) {
             memoryRepository = new MemoryRepository();
         }else {
             return  memoryRepository;
         }
         return memoryRepository;

    }



}
