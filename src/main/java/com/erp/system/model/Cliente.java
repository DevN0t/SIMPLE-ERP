package com.erp.system.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_clientes")
@Getter
@Setter
@NoArgsConstructor
public class Cliente {
    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nome;

    private String endereco;

    private Long plano;

    private String cidade;

    private String uf;

    private String cep;

    private Long celular;

    private Long cpf;

    private String email;

    private String igreja;

    private String pastor;


     public Cliente(String nome, String endereco,Long plano, String cidade, String uf, String cep, Long celular,
            Long cpf, String email, String igreja, String pastor) {
        this.nome = nome;
        this.endereco = endereco;
        this.plano = plano;
        this.cidade = cidade;
        this.uf = uf;
        this.cep = cep;
        this.celular = celular;
        this.cpf = cpf;
        this.email = email;
        this.igreja = igreja;
        this.pastor = pastor;
    }

    
}
