package com.brunoleonardo.arcadenoe.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Estado {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	
	@Column
	String estado;
	
	@OneToMany(mappedBy = "estado")
	List<Cidade> cidades;

	public Estado() {
	}

	public Estado(String estado) {
		this.estado = estado;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public List<Cidade> getCidades() {
		return cidades;
	}

	public void setCidades(List<Cidade> cidades) {
		this.cidades = cidades;
	}
}
