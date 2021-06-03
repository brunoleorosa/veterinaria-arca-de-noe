package com.brunoleonardo.arcadenoe.controllers.dto;

import java.util.List;

import com.brunoleonardo.arcadenoe.entities.Estado;
import com.brunoleonardo.arcadenoe.entities.Pais;

public class PaisDto {
	
	private Long id;
	
	private String pais;
	
	private List<Estado> estado;

	public PaisDto() {
	}

	public PaisDto(Pais pais) {
		this.id = pais.getId();
		this.pais = pais.getPais();
		this.estado = pais.getEstados();
	}

	public Long getId() {
		return id;
	}

	public String getPais() {
		return pais;
	}

	public List<Estado> getEstado() {
		return estado;
	}
}
