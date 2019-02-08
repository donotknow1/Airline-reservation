package com.air.dao;

import com.air.entity.FLightEntity;

public interface IAirDao {

	public abstract void addFlight(FLightEntity ent);
	
	public abstract void beginTransaction();
	
	public abstract void commitTransaction();

	public abstract FLightEntity getFlight(int id);

	public abstract void updateFlight(FLightEntity ent3);

}
