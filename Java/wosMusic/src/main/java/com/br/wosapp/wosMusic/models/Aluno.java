package com.br.wosapp.wosMusic.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Aluno implements Serializable{

	private static final long SerialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String nome;
	private String sexo;
	private String cpf;
	private Endereco endereco;
	private String instrumentos;
	private Contato contato;
	private Responsavel responsavel_finc;
	private Unidade	 unidade;
	
	public Aluno(long id, String nome, String sexo, String cpf, Endereco endereco, String instrumentos, Contato contato,
			Responsavel responsavel_finc, Unidade unidade) {
		super();
		this.id = id;
		this.nome = nome;
		this.sexo = sexo;
		this.cpf = cpf;
		this.endereco = endereco;
		this.instrumentos = instrumentos;
		this.contato = contato;
		this.responsavel_finc = responsavel_finc;
		this.unidade = unidade;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public String getInstrumentos() {
		return instrumentos;
	}
	public void setInstrumentos(String instrumentos) {
		this.instrumentos = instrumentos;
	}
	public Contato getContato() {
		return contato;
	}
	public void setNumero(Contato contato) {
		this.contato = contato;
	}
	public Responsavel getResponsavel_finc() {
		return responsavel_finc;
	}
	public void setResponsavel_finc(Responsavel responsavel_finc) {
		this.responsavel_finc = responsavel_finc;
	}
	public Unidade getUnidade() {
		return unidade;
	}
	public void setUnidade(Unidade unidade) {
		this.unidade = unidade;
	}
}