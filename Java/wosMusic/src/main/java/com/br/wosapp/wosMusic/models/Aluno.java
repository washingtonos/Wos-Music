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
	private String endereco;
	private String instrumentos;
	private int numero;
	private String periodo;
	
	private Aluno(String nome, String sexo, String cpf, String endereco, String instrumentos, int numero, String periodo) {
		this.nome = nome;
		this.sexo = sexo;
		this.cpf = cpf;
		this.endereco = endereco;
		this.instrumentos = instrumentos;
		this.numero = numero;
		this.periodo = periodo;
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
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getInstrumentos() {
		return instrumentos;
	}
	public void setInstrumentos(String instrumentos) {
		this.instrumentos = instrumentos;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getPeriodo() {
		return periodo;
	}
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
}
