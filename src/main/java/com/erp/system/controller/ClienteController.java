package com.erp.system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.erp.system.model.Cliente;
import com.erp.system.model.dto.ClienteDTO;
import com.erp.system.service.ClienteService;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    ClienteService service;

    @PostMapping
    public ResponseEntity<Cliente> newCliente(@RequestBody ClienteDTO clienteDTO){
        return service.newCliente(clienteDTO);
    }
    
}
