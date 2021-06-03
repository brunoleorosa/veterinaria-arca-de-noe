package com.brunoleonardo.arcadenoe.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Endereco {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	
	@Column(name = "logradouro")
	String logradouro;
	
	@Column(name = "CEP")
	String cep;
	
	@Column(name = "bairro")
	String bairro;
	
	@OneToOne
	Cidade cidade;
	
	@OneToOne
	Estado estado;
	
	@OneToOne(fetch = FetchType.EAGER)
	Pais pais;

	public Endereco(Long id, String logradouro, String cep, String bairro, Cidade cidade, Estado estado, Pais pais) {
		this.id = id;
		this.logradouro = logradouro;
		this.cep = cep;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.pais = pais;
	}

	public Long getId() {
		return id;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public String getCep() {
		return cep;
	}

	public String getBairro() {
		return bairro;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public Estado getEstado() {
		return estado;
	}

	public Pais getPais() {
		return pais;
	}
}
