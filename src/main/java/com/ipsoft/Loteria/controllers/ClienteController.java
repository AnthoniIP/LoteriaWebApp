package com.ipsoft.Loteria.controllers;

import com.ipsoft.Loteria.models.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {


        @GetMapping(path = "/clientes/qualquer")
        public Cliente ObterCliente() {
            return new Cliente(28,"Anthoni","023.045.445-00");
        }
}
