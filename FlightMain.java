package com.air.client;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.air.entity.FLightEntity;
import com.air.service.AirService;
import com.air.service.IAirService;

public class FlightMain {

	static IAirService aServ=null;

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	//EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
	//EntityManager em=factory.createEntityManager();
		//em.getTransaction().begin();
		FLightEntity ent=new FLightEntity();
		aServ=new AirService();
		ent.setFlightNo(1286);
		ent.setDepCity("hyderabad");
		ent.setArrCity("chennai");
		ent.setSeatAvail(50);
		aServ.addFlight(ent);
		//em.persist(ent);
	
		FLightEntity ent2=new FLightEntity();
		System.out.println("Please enter the flight number");
		int id=scan.nextInt();
		//ent2=em.find(FLightEntity.class, id);
	    ent2=aServ.getFlight(id);
		
		System.out.println(ent2.getFlightNo()+ent2.getDepCity()+ent2.getArrCity()+ent2.getSeatAvail());
	    
		    
	    FLightEntity ent3=new FLightEntity();
	    System.out.println("Enter number of tickets :");
	    int seat=scan.nextInt();
	    int i=(ent.getSeatAvail()-seat);
	    ent3.setFlightNo(ent.getFlightNo());
	    ent3.setDepCity(ent.getDepCity());
	    ent3.setArrCity(ent.getArrCity());
	    ent3.setSeatAvail(i);
	    aServ.updateFlight(ent3);
	    //em.merge(ent3);          
	    
	    
	    
	    
	    /*
		em.getTransaction().commit();
		em.close();
		factory.close();              */
		
		
		
	}
	
	
	
	
	
}
