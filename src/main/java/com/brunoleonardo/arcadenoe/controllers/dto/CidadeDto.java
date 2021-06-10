package com.brunoleonardo.arcadenoe.controllers.dto;

import com.brunoleonardo.arcadenoe.entities.Cidade;

public class CidadeDto {
	
	Long id;
	
	String cidade;
	
	Long estado;

	public CidadeDto() {
	}

	public CidadeDto(Cidade cidade) {
		this.id = cidade.getId();
		this.cidade = cidade.getCidade();
		this.estado = cidade.getEstado().getId();
	}

	public Long getId() {
		return id;
	}

	public String getCidade() {
		return cidade;
	}

	public Long getEstado() {
		return estado;
	}

}
