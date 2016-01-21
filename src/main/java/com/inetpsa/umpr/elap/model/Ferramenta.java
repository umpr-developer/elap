package com.inetpsa.umpr.elap.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ferramenta {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	private String nome;

	private String descricao;

	private Integer limiteFechamentoDias;

	
	// Getters and Setters
	
	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public Integer getLimiteFechamentoDias() {
		return limiteFechamentoDias;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setLimiteFechamentoDias(Integer limiteFechamentoDias) {
		this.limiteFechamentoDias = limiteFechamentoDias;
	}

	
}
