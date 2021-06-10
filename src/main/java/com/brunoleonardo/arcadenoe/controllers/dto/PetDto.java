package com.brunoleonardo.arcadenoe.controllers.dto;

import com.brunoleonardo.arcadenoe.entities.Cidade;
import com.brunoleonardo.arcadenoe.entities.Endereco;
import com.brunoleonardo.arcadenoe.entities.Estado;
import com.brunoleonardo.arcadenoe.entities.Pet;
import com.brunoleonardo.arcadenoe.entities.Tutor;

public class PetDto {
	
	private Long id;
	
	private String nome;
	
	private String especie;
	
	private String raca;
	
	private Integer idade;
	
	private Long tutorId;
	
	private String tutorNome;
	
	private String tutorSobrenome;
	
	private String tutorCPF;
	
	private String tutorEmail;
	
	private String tutorTelefone;
	
	private Long enderecoId;
	
	private String logradouro;
	
	private String cep;
	
	private String bairro;
	
	private Long cidadeId;
	
	private String cidade;
	
	private Long estadoId;
	
	private String estado;

	public PetDto() {
	}

	public PetDto(Pet pet) {
		this.id = pet.getId();
		this.nome = pet.getNome();
		this.especie = pet.getEspecie();
		this.raca = pet.getRaca();
		this.idade = pet.getIdade();
		this.tutorId = pet.getTutor().getId();
		this.tutorNome = pet.getTutor().getNome();
		this.tutorSobrenome = pet.getTutor().getSobrenome();
		this.tutorCPF = pet.getTutor().getCpf();
		this.tutorEmail = pet.getTutor().getEmail();
		this.tutorTelefone = pet.getTutor().getTelefone();
		this.enderecoId = pet.getTutor().getEndereco().getId();
		this.logradouro = pet.getTutor().getEndereco().getLogradouro();
		this.cep = pet.getTutor().getEndereco().getCep();
		this.bairro = pet.getTutor().getEndereco().getBairro();
		this.cidadeId = pet.getTutor().getEndereco().getCidade().getId();
		this.cidade = pet.getTutor().getEndereco().getCidade().getCidade();
		this.estadoId = pet.getTutor().getEndereco().getCidade().getEstado().getId();
		this.estado = pet.getTutor().getEndereco().getCidade().getEstado().getEstado();
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

	public Long getTutorId() {
		return tutorId;
	}

	public void setTutorId(Long tutorId) {
		this.tutorId = tutorId;
	}

	public String getTutorNome() {
		return tutorNome;
	}

	public void setTutorNome(String tutorNome) {
		this.tutorNome = tutorNome;
	}

	public String getTutorSobrenome() {
		return tutorSobrenome;
	}

	public void setTutorSobrenome(String tutorSobrenome) {
		this.tutorSobrenome = tutorSobrenome;
	}

	public String getTutorCPF() {
		return tutorCPF;
	}

	public void setTutorCPF(String tutorCPF) {
		this.tutorCPF = tutorCPF;
	}

	public String getTutorEmail() {
		return tutorEmail;
	}

	public void setTutorEmail(String tutorEmail) {
		this.tutorEmail = tutorEmail;
	}

	public String getTutorTelefone() {
		return tutorTelefone;
	}

	public void setTutorTelefone(String tutorTelefone) {
		this.tutorTelefone = tutorTelefone;
	}

	public Long getEnderecoId() {
		return enderecoId;
	}

	public void setEnderecoId(Long enderecoId) {
		this.enderecoId = enderecoId;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	public Long getCidadeId() {
		return cidadeId;
	}

	public void setCidadeId(Long cidadeId) {
		this.cidadeId = cidadeId;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public Long getEstadoId() {
		return estadoId;
	}

	public void setEstadoId(Long estadoId) {
		this.estadoId = estadoId;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Pet converter() {
		Estado estado = new Estado();
		estado.getId();
		
		Cidade cidade = new Cidade();
		cidade.getId();
		cidade.setEstado(estado);
		Endereco endereco = new Endereco(this.enderecoId, this.logradouro, this.cep, this.bairro, cidade, estado);
		Tutor tutor = new Tutor(this.tutorId, this.tutorNome, this.tutorSobrenome, this.tutorCPF, this.tutorEmail, endereco, this.tutorTelefone);
		return new Pet(this.id, this.nome, this.especie, this.raca, this.idade, tutor);
	}
}