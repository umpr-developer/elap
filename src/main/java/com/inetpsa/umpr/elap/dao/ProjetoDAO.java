package com.inetpsa.umpr.elap.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import com.inetpsa.umpr.elap.model.Projeto;

@Stateless
public class ProjetoDAO {
	
	@PersistenceContext
	private EntityManager manager;
	
	public void salva(Projeto projeto){
		this.manager.persist(projeto);
		System.out.println("Projeto "+ projeto + " salvo...");
	}
	
	public Projeto busca(Long id){
		return this.manager.find(Projeto.class, id);
	}
	
	public List<Projeto> lista(){
		CriteriaBuilder builder = this.manager.getCriteriaBuilder();
		CriteriaQuery<Projeto> criteria = builder.createQuery(Projeto.class);
		criteria.from(Projeto.class);
		return this.manager.createQuery(criteria).getResultList();
	}
	
	public void remove(Projeto projeto){
		manager.remove(projeto);
		System.out.println("Projeto: " + projeto + " removido.");
	}

}
