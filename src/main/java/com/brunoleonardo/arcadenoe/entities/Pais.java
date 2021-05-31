package com.brunoleonardo.arcadenoe.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Pais {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	
	@Column(name = "pais")
	String pais;
	
	@Column(name = "estado")
	@OneToMany(mappedBy = "pais")
	List<Estado> estados;

	public Pais(Long id, String pais, List<Estado> estados) {
		this.id = id;
		this.pais = pais;
		this.estados = estados;
	}

	public Long getId() {
		return id;
	}

	public String getPais() {
		return pais;
	}

	public List<Estado> getEstados() {
		return estados;
	}

}
