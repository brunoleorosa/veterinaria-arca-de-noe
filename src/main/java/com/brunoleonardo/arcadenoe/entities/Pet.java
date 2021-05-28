package com.brunoleonardo.arcadenoe.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Pet {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	
	@Column(name = "pet_nome", length = 30)
	String nome;
	
	@Column(name = "raca", length = 30)
	String raca;
	
	@Column(name = "idade")
	Integer idade;
	
	@ManyToOne()
	Tutor tutor;

	public Pet(Long id, String nome, String raca, Integer idade, Tutor tutor) {
		this.id = id;
		this.nome = nome;
		this.raca = raca;
		this.idade = idade;
		this.tutor = tutor;
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getRaca() {
		return raca;
	}

	public Integer getIdade() {
		return idade;
	}

	public Tutor getTutor() {
		return tutor;
	}

}
