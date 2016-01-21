package com.inetpsa.umpr.elap.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import com.inetpsa.umpr.elap.model.Usuario;

@Stateless
public class UsuarioDAO {
	
	@PersistenceContext
	private EntityManager manager;
	
	public void salva(Usuario usuario){
		this.manager.persist(usuario);
		System.out.println("Usuario "+ usuario + " salvo...");
	}
	
	public Usuario busca(Long id){
		return this.manager.find(Usuario.class, id);
	}
	
	public List<Usuario> lista(){
		CriteriaBuilder builder = this.manager.getCriteriaBuilder();
		CriteriaQuery<Usuario> criteria = builder.createQuery(Usuario.class);
		criteria.from(Usuario.class);
		return this.manager.createQuery(criteria).getResultList();
	}
	
	public void remove(Usuario usuario){
		manager.remove(usuario);
		System.out.println("Usuario: " + usuario + " removido.");
	}


}
