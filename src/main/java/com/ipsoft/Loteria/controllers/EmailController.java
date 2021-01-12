package com.ipsoft.Loteria.controllers;

import com.ipsoft.Loteria.models.Cliente;
import com.ipsoft.Loteria.models.Sorteio;
import com.ipsoft.Loteria.models.repository.MemoryRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmailController {

    @GetMapping("/newEmail")
    public String greeting(@RequestParam(name="email", required=false, defaultValue="teste@gmail.com") String email) {

        MemoryRepository mRepository = MemoryRepository.getInstance();

        if(mRepository.getClientes().contains(email)) {

            Integer index = mRepository.getClientes().indexOf(email);
            Cliente cliente = mRepository.getClientes().get(index);

            return cliente.toString();

        }else {
            Cliente cliente = new Cliente(email);
            List<Integer> sorteio = new GetNumbers().randomNumber().getNumeros();
            cliente.setSorteios(sorteio);

            return cliente;
        }

    }

}