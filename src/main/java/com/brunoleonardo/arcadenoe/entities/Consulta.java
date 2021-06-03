package com.brunoleonardo.arcadenoe.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Consulta {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	
	@Column(name = "diagnostico")
	String diagnostico;
	
	@Column(name = "tratamento")
	String tratamento;
	
	@OneToOne
	Agendamento agendamento;

	public Consulta() {
	}

	public Consulta(Long id, String diagnostico, String tratamento, Agendamento agendamento) {
		this.id = id;
		this.diagnostico = diagnostico;
		this.tratamento = tratamento;
		this.agendamento = agendamento;
	}

	public Long getId() {
		return id;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public String getTratamento() {
		return tratamento;
	}

	public Agendamento getAgendamento() {
		return agendamento;
	}
	
}
