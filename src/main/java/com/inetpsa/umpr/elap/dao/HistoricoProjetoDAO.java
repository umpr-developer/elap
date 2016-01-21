package com.inetpsa.umpr.elap.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import com.inetpsa.umpr.elap.model.HistoricoProjeto;

@Stateless
public class HistoricoProjetoDAO {
	
	@PersistenceContext
	private EntityManager manager;
	
	public void salva(HistoricoProjeto historicoProjeto){
		this.manager.persist(historicoProjeto);
		System.out.println("Historico Projeto "+ historicoProjeto + " salvo...");
	}
	
	public HistoricoProjeto busca(Long id){
		return this.manager.find(HistoricoProjeto.class, id);
	}
	
	public List<HistoricoProjeto> lista(){
		CriteriaBuilder builder = this.manager.getCriteriaBuilder();
		CriteriaQuery<HistoricoProjeto> criteria = builder.createQuery(HistoricoProjeto.class);
		criteria.from(HistoricoProjeto.class);
		return this.manager.createQuery(criteria).getResultList();
	}
	
	public void remove(HistoricoProjeto historicoProjeto){
		manager.remove(historicoProjeto);
		System.out.println("Historico Projeto: " + historicoProjeto + " removido.");
	}


}
