package com.bolsadeideas.springboot.app.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.bolsadeideas.springboot.app.models.entity.Cliente;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository("ClienteDaoJPA")
//@Repository
public class ClienteDaoImpl implements IClienteDao {

	public ClienteDaoImpl() {
		// TODO Auto-generated constructor stub
	}

	@PersistenceContext
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	@Transactional
	@Override
	public List<Cliente> findAll() {
		// TODO Auto-generated method stub
		return em.createQuery("from Cliente").getResultList();
		
	}

}
