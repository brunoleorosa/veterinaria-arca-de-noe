package com.brunoleonardo.arcadenoe.entities;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Agendamento {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	
	@Column(name = "data")
	LocalDate dataDoAgendamento;
	
	@Column(name = "hora")
	LocalTime horaDoAgendamento;
	
	@OneToOne
	Veterinario veterinario;
	
	@OneToOne
	Pet pet;

	public Agendamento() {
	}

	public Agendamento(Long id, LocalDate dataDoAgendamento, LocalTime horaDoAgendamento, Veterinario veterinario,
			Pet pet) {
		this.id = id;
		this.dataDoAgendamento = dataDoAgendamento;
		this.horaDoAgendamento = horaDoAgendamento;
		this.veterinario = veterinario;
		this.pet = pet;
	}

	public Long getId() {
		return id;
	}

	public LocalDate getDataDoAgendamento() {
		return dataDoAgendamento;
	}

	public LocalTime getHoraDoAgendamento() {
		return horaDoAgendamento;
	}

	public Veterinario getVeterinario() {
		return veterinario;
	}

	public Pet getPet() {
		return pet;
	}
	
}
