package com.brunoleonardo.arcadenoe.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Endereco {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	
	@Column(name = "logradouro")
	String logradouro;
	
	@Column(name = "CEP")
	String cep;
	
	@Column(name = "Bairro")
	String bairro;
	
	@Column(name = "Cidade")
	String cidade;
	
	@Column(name = "Estado")
	String estado;
	
	@Column(name = "País")
	String pais;

	public Endereco(Long id, String logradouro, String cep, String bairro, String cidade, String estado, String pais) {
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

	public String getCidade() {
		return cidade;
	}

	public String getEstado() {
		return estado;
	}

	public String getPais() {
		return pais;
	}	
}
