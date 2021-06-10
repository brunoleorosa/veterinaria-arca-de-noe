package com.brunoleonardo.arcadenoe.controllers.dto;

import com.brunoleonardo.arcadenoe.entities.Cidade;
import com.brunoleonardo.arcadenoe.entities.Endereco;
import com.brunoleonardo.arcadenoe.entities.Estado;
import com.brunoleonardo.arcadenoe.entities.Tutor;

public class TutorDto {
	
	private Long id;
	
	private String nome;
	
	private String sobrenome;
	
	private String cpf;
	
	private String email;
	
	private String logradouro;
	
	private String telefone;
	
	private Long enderecoId;
	
	private Long cidadeId;
	
	private Long estadoId;

	private String cep;

	private String bairro;

	private Cidade cidade;

	private Estado estado;

	public TutorDto() {
	}

	public TutorDto(Tutor tutor) {
		this.id = tutor.getId();
		this.nome = tutor.getNome();
		this.sobrenome = tutor.getSobrenome();
		this.cpf = tutor.getCpf();
		this.email = tutor.getEmail();
		this.enderecoId = tutor.getEndereco().getId();
		this.logradouro = tutor.getEndereco().getLogradouro();
		this.cep = tutor.getEndereco().getCep();
		this.bairro = tutor.getEndereco().getBairro();
		this.cidadeId = tutor.getEndereco().getCidade().getId();
		this.cidade = tutor.getEndereco().getCidade();
		this.estadoId = tutor.getEndereco().getEstado().getId();
		this.estado = tutor.getEndereco().getEstado();
		this.telefone = tutor.getTelefone();
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setEndereco(String logradouro) {
		this.logradouro = logradouro;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public void setEnderecoId(Long enderecoId) {
		this.enderecoId = enderecoId;
	}

	public void setCidadeId(Long cidadeId) {
		this.cidadeId = cidadeId;
	}

	public void setEstadoId(Long estadoId) {
		this.estadoId = estadoId;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
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

	public String getEmail() {
		return email;
	}

	public String getEndereco() {
		return logradouro;
	}

	public String getTelefone() {
		return telefone;
	}

	public Long getEnderecoId() {
		return enderecoId;
	}

	public Long getCidadeId() {
		return cidadeId;
	}

	public Long getEstadoId() {
		return estadoId;
	}

	public String getCep() {
		return cep;
	}

	public String getBairro() {
		return bairro;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public Estado getEstado() {
		return estado;
	}	

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public Tutor converter() {
		Estado estado = new Estado();
		estado.getId();
		
		Cidade cidade = new Cidade();
		cidade.getId();
		cidade.setEstado(estado);
		
		Endereco endereco = new Endereco(this.enderecoId, this.logradouro, this.cep, this.bairro, cidade, estado);
		return new Tutor(this.id, this.nome, this.sobrenome, this.cpf, this.email, endereco, this.telefone);
	}
}
