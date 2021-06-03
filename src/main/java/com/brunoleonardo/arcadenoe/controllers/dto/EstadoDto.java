package com.brunoleonardo.arcadenoe.controllers.dto;

import com.brunoleonardo.arcadenoe.entities.Estado;

public class EstadoDto {
	
	Long id;
	
	String estado;
	
	Long pais_id;

	public Long getId() {
		return id;
	}

	public String getEstado() {
		return estado;
	}

	public Long getPais_id() {
		return pais_id;
	}

	public EstadoDto() {
	}

	public EstadoDto(Estado estado) {
		this.id = estado.getId();
		this.estado = estado.getEstado();
		this.pais_id = estado.getPais().getId();
	}
	
	

}
