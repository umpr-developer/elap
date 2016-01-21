package com.inetpsa.umpr.elap.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import com.inetpsa.umpr.elap.model.Acao;

@Stateless
public class AcaoDAO {
	
	@PersistenceContext
	private EntityManager manager;
	
	public void salva(Acao acao){
		this.manager.persist(acao);
		System.out.println("Ação "+ acao + " salva.");
	}
	
	public Acao busca(Long id){
		return this.manager.find(Acao.class, id);
	}
	
	public List<Acao> lista(){
		CriteriaBuilder builder = this.manager.getCriteriaBuilder();
		CriteriaQuery<Acao> criteria = builder.createQuery(Acao.class);
		criteria.from(Acao.class);
		return this.manager.createQuery(criteria).getResultList();
	}
	
	public void remove(Acao acao){
		manager.remove(acao);
		System.out.println("Ação " + acao + " removida.");
	}

}
