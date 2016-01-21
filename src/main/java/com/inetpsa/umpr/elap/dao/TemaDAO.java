package com.inetpsa.umpr.elap.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import com.inetpsa.umpr.elap.model.Tema;

@Stateless
public class TemaDAO {
	
	@PersistenceContext
	private EntityManager manager;
	
	public void salva(Tema tema){
		this.manager.persist(tema);
		System.out.println("Tema "+ tema + " salvo...");
	}
	
	public Tema busca(Long id){
		return this.manager.find(Tema.class, id);
	}
	
	public List<Tema> lista(){
		CriteriaBuilder builder = this.manager.getCriteriaBuilder();
		CriteriaQuery<Tema> criteria = builder.createQuery(Tema.class);
		criteria.from(Tema.class);
		return this.manager.createQuery(criteria).getResultList();
	}
	
	public void remove(Tema tema){
		manager.remove(tema);
		System.out.println("Tema: " + tema + " removido.");
	}


}
