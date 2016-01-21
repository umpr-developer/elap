package com.inetpsa.umpr.elap.model;

import java.io.Serializable;
import java.util.Date;

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
public class Acao implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	//Abertura da Ação
	
	private String acao;

	@Temporal(TemporalType.DATE)
	private Date dataAbertura;

	@Temporal(TemporalType.DATE)
	private Date prazo;

	@ManyToOne
	private Usuario piloto;
	
	private int prioridade;
	
	
	//Pilotagem da Ação
	
	private Integer evolucao;

	//Cadastro automático
	
	@Temporal(TemporalType.DATE)
	private Date dataFechamento;

	@Enumerated(EnumType.STRING)
	private StatusAcao status;
	
	private String unidadeOrganizacional;

	@ManyToOne
	private Projeto projeto;
	
	// Getters and Setters

	public Long getId() {
		return id;
	}

	public String getAcao() {
		return acao;
	}

	public Date getDataAbertura() {
		return dataAbertura;
	}

	public Date getPrazo() {
		return prazo;
	}

	public Integer getEvolucao() {
		return evolucao;
	}

	public Date getDataFechamento() {
		return dataFechamento;
	}

	public Usuario getPiloto() {
		return piloto;
	}

	public String getUnidadeOraganizacional() {
		return unidadeOrganizacional;
	}

	public StatusAcao getStatus() {
		return status;
	}

	public int getPrioridade() {
		return prioridade;
	}

	public Projeto getProjeto() {
		return projeto;
	}

	public void setAcao(String acao) {
		this.acao = acao;
	}

	public void setDataAbertura(Date dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public void setPrazo(Date prazo) {
		this.prazo = prazo;
	}

	public void setEvolucao(Integer evolucao) {
		this.evolucao = evolucao;
	}

	public void setDataFechamento(Date dataFechamento) {
		this.dataFechamento = dataFechamento;
	}

	public void setPiloto(Usuario piloto) {
		this.piloto = piloto;
	}

	public void setUnidadeOraganizacional(String unidadeOraganizacional) {
		this.unidadeOrganizacional = unidadeOraganizacional;
	}

	public void setStatus(StatusAcao status) {
		this.status = status;
	}

	public void setPrioridade(int prioridade) {
		this.prioridade = prioridade;
	}

	public void setProjeto(Projeto projeto) {
		this.projeto = projeto;
	}

			
	}
