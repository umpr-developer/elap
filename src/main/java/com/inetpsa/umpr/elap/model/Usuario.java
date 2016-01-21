package com.inetpsa.umpr.elap.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	private String identifiant;

	private String email;

	private String nome;

	private String nomeLDAP;

	private String unidadeOrganizacional;
	
	// Getters and Setters

	public Long getId() {
		return id;
	}

	public String getIdentifiant() {
		return identifiant;
	}

	public String getEmail() {
		return email;
	}

	public String getNome() {
		return nome;
	}

	public String getNomeLDAP() {
		return nomeLDAP;
	}

	public String getUnidadeOrganizacional() {
		return unidadeOrganizacional;
	}

	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setNomeLDAP(String nomeLDAP) {
		this.nomeLDAP = nomeLDAP;
	}

	public void setUnidadeOrganizacional(String unidadeOrganizacional) {
		this.unidadeOrganizacional = unidadeOrganizacional;
	}

	
}
