package com.inetpsa.umpr.elap.model;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Projeto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	private String titulo;

	private String descricao;

	@Temporal(TemporalType.DATE)
	private Calendar dataAbertura;

	@Temporal(TemporalType.DATE)
	private Calendar prazo;

	@Enumerated(EnumType.STRING)
	private StatusProjeto status;

	private String unidadeOrganizacional;

	@Temporal(TemporalType.DATE)
	private Calendar dataFechamento;

	@ManyToOne
	private Ferramenta ferramenta;

	@ManyToOne
	private Usuario piloto;

	@ManyToMany
	private List<Usuario> participantes;

	@ManyToMany
	private List<Tema> temas;

	@OneToMany(mappedBy="projeto")
	private List<Acao> acoes;
	
	
	// Getters and Setters
	

	public Long getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public Calendar getDataAbertura() {
		return dataAbertura;
	}

	public Calendar getPrazo() {
		return prazo;
	}

	public StatusProjeto getStatus() {
		return status;
	}

	public String getUnidadeOrganizacional() {
		return unidadeOrganizacional;
	}

	public Calendar getDataFechamento() {
		return dataFechamento;
	}

	public Ferramenta getFerramenta() {
		return ferramenta;
	}

	public Usuario getPiloto() {
		return piloto;
	}

	public List<Usuario> getParticipante() {
		return participantes;
	}

	public List<Tema> getTemas() {
		return temas;
	}

	public List<Acao> getAcoes() {
		return acoes;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setDataAbertura(Calendar dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public void setPrazo(Calendar prazo) {
		this.prazo = prazo;
	}

	public void setStatus(StatusProjeto status) {
		this.status = status;
	}

	public void setUnidadeOrganizacional(String unidadeOrganizacional) {
		this.unidadeOrganizacional = unidadeOrganizacional;
	}

	public void setDataFechamento(Calendar dataFechamento) {
		this.dataFechamento = dataFechamento;
	}

	public void setFerramenta(Ferramenta ferramenta) {
		this.ferramenta = ferramenta;
	}

	public void setPiloto(Usuario piloto) {
		this.piloto = piloto;
	}

	public void setParticipante(List<Usuario> participante) {
		this.participantes = participante;
	}

	public void setTemas(List<Tema> temas) {
		this.temas = temas;
	}

	public void setAcoes(List<Acao> acoes) {
		this.acoes = acoes;
	}
	
	public String toString(){
		return "Projeto: "+ id + " - Titulo: " + titulo;
	}

	

}
