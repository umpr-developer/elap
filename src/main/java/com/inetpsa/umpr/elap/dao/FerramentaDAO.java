package com.inetpsa.umpr.elap.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import com.inetpsa.umpr.elap.model.Ferramenta;

@Stateless
public class FerramentaDAO {
	
	@PersistenceContext
	private EntityManager manager;
	
	public void salva(Ferramenta ferramenta){
		this.manager.persist(ferramenta);
		System.out.println("Ferramenta "+ ferramenta + " salvo...");
	}
	
	public Ferramenta busca(Long id){
		return this.manager.find(Ferramenta.class, id);
	}
	
	public List<Ferramenta> lista(){
		CriteriaBuilder builder = this.manager.getCriteriaBuilder();
		CriteriaQuery<Ferramenta> criteria = builder.createQuery(Ferramenta.class);
		criteria.from(Ferramenta.class);
		return this.manager.createQuery(criteria).getResultList();
	}
	
	public void remove(Ferramenta ferramenta){
		manager.remove(ferramenta);
		System.out.println("Ferramenta: " + ferramenta + " removido.");
	}

}
