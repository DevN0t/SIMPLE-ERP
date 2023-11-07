package com.erp.system.model.dto;



public record ClienteDTO(
    String nome,

    String endereco,
    
    Long plano,

    String cidade,

    String uf,

    String cep,

    Long celular,

    Long cpf,

    String email,

    String igreja,

    String pastor


) {
} 


