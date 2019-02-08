package com.air.service;

import com.air.entity.FLightEntity;

public interface IAirService {

	public abstract void addFlight(FLightEntity ent);

	public abstract FLightEntity getFlight(int id);

	public abstract void updateFlight(FLightEntity ent3);

}
