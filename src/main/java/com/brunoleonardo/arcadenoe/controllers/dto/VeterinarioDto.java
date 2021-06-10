package com.brunoleonardo.arcadenoe.controllers.dto;

import com.brunoleonardo.arcadenoe.entities.Cidade;
import com.brunoleonardo.arcadenoe.entities.Endereco;
import com.brunoleonardo.arcadenoe.entities.Estado;
import com.brunoleonardo.arcadenoe.entities.Veterinario;

public class VeterinarioDto {
	
	private Long id;
	
	private String nome;
	
	private String sobrenome;
	
	private String cpf;
	
	private String crmv;
	
	private String especialidade;
	
	private String telefone;
	
	private Long enderecoId;
	
	private String logradouro;
	
	private String cep;
	
	private String bairro;
	
	private Long cidadeId;
	
	private String cidade;
	
	private Long estadoId;
	
	private String estado;
	
	public VeterinarioDto() {
	}
	
	public VeterinarioDto(Veterinario veterinario) {
		this.id = veterinario.getId();
		this.nome = veterinario.getNome();
		this.sobrenome = veterinario.getSobrenome();
		this.cpf = veterinario.getCpf();
		this.crmv = veterinario.getCrmv();
		this.especialidade = veterinario.getEspecialidade();
		this.telefone = veterinario.getTelefone();
		this.enderecoId = veterinario.getEndereco().getId();
		this.logradouro = veterinario.getEndereco().getLogradouro();
		this.cep = veterinario.getEndereco().getCep();
		this.bairro = veterinario.getEndereco().getBairro();
		this.cidadeId = veterinario.getEndereco().getCidade().getId();
		this.cidade = veterinario.getEndereco().getCidade().getCidade();
		this.estadoId = veterinario.getEndereco().getEstado().getId();
		this.estado = veterinario.getEndereco().getEstado().getEstado();
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

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCrmv() {
		return crmv;
	}

	public void setCrmv(String crmv) {
		this.crmv = crmv;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
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
	
	public Veterinario converter() {
		Estado estado = new Estado(this.estado);
		Cidade cidade = new Cidade(this.cidade, estado);
		Endereco endereco = new Endereco(this.enderecoId, this.logradouro, this.cep, this.bairro, cidade, estado);
		return new Veterinario(this.id, this.nome, this.sobrenome, this.cpf, this.crmv, this.especialidade, this.telefone, endereco);
	}
}
