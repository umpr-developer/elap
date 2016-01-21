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
public class HistoricoProjeto {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	private Projeto projeto;

	@Temporal(TemporalType.TIMESTAMP)
	private Calendar dataEHora;

	@Enumerated(EnumType.STRING)
	private StatusProjeto statusProjeto;

	private String comentario;

	@ManyToOne
	private Usuario usuario;

	public Long getId() {
		return id;
	}

	public Projeto getProjeto() {
		return projeto;
	}

	public Calendar getDataEHora() {
		return dataEHora;
	}

	public StatusProjeto getStatusProjeto() {
		return statusProjeto;
	}

	public String getComentario() {
		return comentario;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setProjeto(Projeto projeto) {
		this.projeto = projeto;
	}

	public void setDataEHora(Calendar dataEHora) {
		this.dataEHora = dataEHora;
	}

	public void setStatusProjeto(StatusProjeto statusProjeto) {
		this.statusProjeto = statusProjeto;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	
}
