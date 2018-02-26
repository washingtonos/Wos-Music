package com.br.wosapp.wosMusic.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Unidade implements Serializable{

	private static final long SerialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long id;
	private String nome;
	private Endereco endereco;
	private Contato contatos;
	
	public Unidade(long id, String nome, Endereco endereco, Contato contatos) {
		super();
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.contatos = contatos;
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

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Contato getContatos() {
		return contatos;
	}

	public void setContatos(Contato contatos) {
		this.contatos = contatos;
	}
}
