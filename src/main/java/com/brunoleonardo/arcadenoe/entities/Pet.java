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
public class Pet {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "pet_nome", length = 30)
	private String nome;
	
	@Column(name = "espécie", length = 30)
	private String especie;
	
	@Column(name = "raca", length = 30)
	private String raca;
	
	@Column(name = "idade")
	private Integer idade;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Tutor tutor;
	
	public Pet() {
	}

	public Pet(Long id, String nome, String especie, String raca, Integer idade, Tutor tutor) {
		this.id = id;
		this.nome = nome;
		this.especie = especie;
		this.raca = raca;
		this.idade = idade;
		this.tutor = tutor;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Tutor getTutor() {
		return tutor;
	}

	public void setTutor(Tutor tutor) {
		this.tutor = tutor;
	}
}
