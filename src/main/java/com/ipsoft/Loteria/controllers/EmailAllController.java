package com.ipsoft.Loteria.controllers;

import com.ipsoft.Loteria.models.Cliente;
import com.ipsoft.Loteria.models.repository.MemoryRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmailAllController {

    @GetMapping("/getEmail")
    public String getAllSortsFromEmail(@RequestParam(name="email", required=true) String email) {

        String sorteios = "";
        MemoryRepository mRepository = MemoryRepository.getInstance();

        if(mRepository.getClientes().contains(email)) {

            Integer index = mRepository.getClientes().indexOf(email);
            Cliente cliente = mRepository.getClientes().get(index);

            for(Integer numero : cliente.getSorteios()) {

                sorteios += numero + " ";

            }

            return sorteios;

        }else {

            return "Não foram localizados sorteios para esse e-mail";
        }


    }

}
