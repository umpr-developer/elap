package com.inetpsa.umpr.elap.model;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class HistoricoAcao {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	@Temporal(TemporalType.TIMESTAMP)
	private Calendar dataEHora;

	@Enumerated(EnumType.STRING)
	private StatusAcao statusAcao;

	private String comentario;

	@ManyToOne
	private Acao acao;

	@ManyToOne
	private Usuario usuario;


	// Getters and Setters
	
	public Long getId() {
		return id;
	}

	public Calendar getDataEHora() {
		return dataEHora;
	}

	public StatusAcao getStatusAcao() {
		return statusAcao;
	}

	public String getComentario() {
		return comentario;
	}

	public Acao getAcao() {
		return acao;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setDataEHora(Calendar dataEHora) {
		this.dataEHora = dataEHora;
	}

	public void setStatusAcao(StatusAcao statusAcao) {
		this.statusAcao = statusAcao;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public void setAcao(Acao acao) {
		this.acao = acao;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

		
}
