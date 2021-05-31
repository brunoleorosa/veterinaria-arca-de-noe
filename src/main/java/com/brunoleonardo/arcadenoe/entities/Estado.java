package com.brunoleonardo.arcadenoe.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Estado {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	
	@Column(name = "estado")
	String estado;
	
	@ManyToOne
	Pais pais;
	
	@Column(name = "cidade_id")
	@OneToMany(mappedBy = "estado")
	List<Cidade> cidades;

	public Estado(Long id, String estado, Pais pais, List<Cidade> cidades) {
		this.id = id;
		this.estado = estado;
		this.pais = pais;
		this.cidades = cidades;
	}

	public Long getId() {
		return id;
	}

	public String getEstado() {
		return estado;
	}

	public Pais getPais() {
		return pais;
	}

	public List<Cidade> getCidades() {
		return cidades;
	}

}
