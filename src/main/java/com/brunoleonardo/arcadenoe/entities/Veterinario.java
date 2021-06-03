package com.brunoleonardo.arcadenoe.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Veterinario {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    
    @Column(name = "veterinario_nome", length = 20)
    String nome;
    
    @Column(name = "veterinario_sobrenome", length = 50)
	String sobrenome;
	
	@Column(name = "CPF")
	String cpf;
    
    @Column(name = "CRMV")
    String crmv;
    
    @Column(name = "especialidade", length = 50)
    String especiallidade;
    
    @Column(name = "telefone", length = 30)
    String telefone;
	
	@OneToOne
	Endereco endereco;
    
    public Veterinario(Long id, String nome, String sobrenome, String cpf, String crmv, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.crmv = crmv;
        this.endereco = endereco;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getCrmv() {
        return crmv;
    }

    public Endereco getEndereco() {
        return endereco;
    }    
}
