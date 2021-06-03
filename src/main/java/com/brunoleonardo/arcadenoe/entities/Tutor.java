package com.brunoleonardo.arcadenoe.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Tutor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	
	@Column(name = "tutor_nome", length = 20)
	String nome;
	
	@Column(name = "tutor_sobrenome", length = 50)
	String sobrenome;
	
	@Column(name = "CPF", unique = true)
	String cpf;
	
	@Column(name = "email")
	String email;
	
	@OneToOne(fetch = FetchType.EAGER)
	Endereco endereco;
	
	@Column(name = "telefone")
	String telefone;
	
	@OneToMany(mappedBy = "tutor")
	List<Pet> pet = new ArrayList<Pet>();

	public Tutor() {
	}

	public Tutor(Long id, String nome, String sobrenome, String cpf, Endereco endereco, List<Pet> pet) {
		this.id = id;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.pet = pet;
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public String getCpf() {
		return cpf;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public List<Pet> getPet() {
		return pet;
	}
	

}
