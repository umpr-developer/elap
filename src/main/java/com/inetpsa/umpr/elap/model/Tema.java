package com.inetpsa.umpr.elap.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tema {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	private String tema;

	private String descricao;

	private Integer limiteFechamentoDias;

	
	// Getters and Setters
	
	public Long getId() {
		return id;
	}

	public String getTema() {
		return tema;
	}

	public String getDescricao() {
		return descricao;
	}

	public Integer getLimiteFechamentoDias() {
		return limiteFechamentoDias;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setLimiteFechamentoDias(Integer limiteFechamentoDias) {
		this.limiteFechamentoDias = limiteFechamentoDias;
	}

	
}
