package com.brunoleonardo.arcadenoe.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Cidade {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	
	@Column
	String cidade;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	Estado estado;

	public Cidade() {
	}

	public Cidade(String cidade, Estado estado) {
		this.cidade = cidade;
		this.estado = estado;
	}

	public Long getId() {
		return id;
	}

	public String getCidade() {
		return cidade;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}
}
