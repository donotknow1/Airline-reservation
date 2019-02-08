package com.air.dao;

import javax.persistence.EntityManager;

import com.air.entity.FLightEntity;

public class AirDao implements IAirDao {

	static EntityManager entityManager =JPAUtil.getEntityManager();
	
	
	@Override
	public void addFlight(FLightEntity ent) {
	
		
		entityManager.persist(ent);
		
	}

	@Override
	public FLightEntity getFlight(int id) {
		
		return entityManager.find(FLightEntity.class, id);
	    
	
	}

	@Override
	public void updateFlight(FLightEntity ent3) {
		
		entityManager.merge(ent3);
	}

	
	@Override
	public void beginTransaction() {
		
		entityManager.getTransaction().begin();
	}


	@Override
	public void commitTransaction() {
		
		entityManager.getTransaction().commit();
	}

	


	
	
	
	
}
