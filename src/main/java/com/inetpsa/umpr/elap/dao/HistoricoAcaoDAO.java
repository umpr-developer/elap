package com.inetpsa.umpr.elap.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import com.inetpsa.umpr.elap.model.HistoricoAcao;

@Stateless
public class HistoricoAcaoDAO {
	
	@PersistenceContext
	private EntityManager manager;
	
	public void salva(HistoricoAcao historicoAcao){
		this.manager.persist(historicoAcao);
		System.out.println("Historico Ação "+ historicoAcao + " salvo...");
	}
	
	public HistoricoAcao busca(Long id){
		return this.manager.find(HistoricoAcao.class, id);
	}
	
	public List<HistoricoAcao> lista(){
		CriteriaBuilder builder = this.manager.getCriteriaBuilder();
		CriteriaQuery<HistoricoAcao> criteria = builder.createQuery(HistoricoAcao.class);
		criteria.from(HistoricoAcao.class);
		return this.manager.createQuery(criteria).getResultList();
	}
	
	public void remove(HistoricoAcao historicoAcao){
		manager.remove(historicoAcao);
		System.out.println("Historico Ação: " + historicoAcao + " removido.");
	}


}
