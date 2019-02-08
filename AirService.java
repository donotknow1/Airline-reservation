package com.air.service;

import com.air.dao.AirDao;
import com.air.dao.IAirDao;
import com.air.entity.FLightEntity;

public class AirService implements IAirService{

	static IAirDao aDao=null;
	
	@Override
	public void addFlight(FLightEntity ent) {
		
		aDao=new AirDao();
		aDao.beginTransaction();
		aDao.addFlight(ent);
		aDao.commitTransaction();
	}

	@Override
	public FLightEntity getFlight(int id) {
		aDao=new AirDao();
		aDao.beginTransaction();
		aDao.getFlight(id);
		aDao.commitTransaction();
		
		return aDao.getFlight(id);
	
		
	}

	@Override
	public void updateFlight(FLightEntity ent3) {
		aDao=new AirDao();
		aDao.beginTransaction();
		aDao.updateFlight(ent3);
		aDao.commitTransaction();
		
	}
	
	
	

}
