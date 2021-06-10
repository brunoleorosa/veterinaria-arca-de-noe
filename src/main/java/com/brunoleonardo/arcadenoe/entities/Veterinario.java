package com.brunoleonardo.arcadenoe.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Veterinario {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "veterinario_nome", length = 20)
    private String nome;
    
    @Column(name = "veterinario_sobrenome", length = 50)
    private String sobrenome;
	
	@Column(name = "CPF")
	private String cpf;
    
    @Column(name = "CRMV")
    private String crmv;
    
    @Column(name = "especialidade", length = 50)
    private String especialidade;
    
    @Column(name = "telefone", length = 30)
    private String telefone;
	
	@OneToOne(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
	private Endereco endereco;
    
    public Veterinario() {
	}

	public Veterinario(Long id, String nome, String sobrenome, String cpf, String crmv, String especialidade,
			String telefone, Endereco endereco) {
		this.id = id;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
		this.crmv = crmv;
		this.especialidade = especialidade;
		this.telefone = telefone;
		this.endereco = endereco;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCrmv() {
		return crmv;
	}

	public void setCrmv(String crmv) {
		this.crmv = crmv;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}
