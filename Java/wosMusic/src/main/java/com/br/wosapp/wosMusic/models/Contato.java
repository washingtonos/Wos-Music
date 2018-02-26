package com.br.wosapp.wosMusic.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Contato implements Serializable{

	private static final long SerialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long id;
	private int numeroCel;
	private int numeroTel;
	private String email;
	
	public Contato(long id, int numeroCel, int numeroTel, String email) {
		super();
		this.id = id;
		this.numeroCel = numeroCel;
		this.numeroTel = numeroTel;
		this.email = email;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getNumeroCel() {
		return numeroCel;
	}

	public void setNumeroCel(int numeroCel) {
		this.numeroCel = numeroCel;
	}

	public int getNumeroTel() {
		return numeroTel;
	}

	public void setNumeroTel(int numeroTel) {
		this.numeroTel = numeroTel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
