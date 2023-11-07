package com.erp.system.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.erp.system.model.Cliente;
import com.erp.system.model.dto.ClienteDTO;
import com.erp.system.repository.ClienteRepository;

@Service
public class ClienteService {

    @Autowired
    ClienteRepository repository;

    public ResponseEntity<Cliente> newCliente(@RequestBody ClienteDTO clienteDTO){
        Cliente newCliente = new Cliente(clienteDTO.nome(),clienteDTO.endereco(),clienteDTO.plano(), clienteDTO.cidade(), clienteDTO.uf(), clienteDTO.cep(),clienteDTO.celular(), clienteDTO.cpf(),clienteDTO.email(), clienteDTO.igreja(), clienteDTO.pastor());
        this.repository.save(newCliente);
        return ResponseEntity.ok().build();
    }
}
    

