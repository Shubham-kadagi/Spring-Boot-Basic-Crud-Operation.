package com.Restservice.demo.Service;

import java.util.List;
import java.lang.Long;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Restservice.demo.Entity.Sport;
import com.Restservice.demo.Repository.Sportrepository;



@Service
public class Sportservice {
	
	@Autowired
	public Sportrepository sportrepository;
	
	public Sportservice(Sportrepository sportrepository) {
		
		this.sportrepository = sportrepository;
	}





// Service layer starts from here
	
	
	
	public List<Sport> getsport()
	{
		
		return sportrepository.findAll();
			
	}
	
	


	public void addsport(Sport sport) 
	
	{
	  sportrepository.save(sport);
    }
	
	
	
	
	public Sport updatesport(Long id, Sport sport) 
	{
		Sport sport1=  sportrepository.findById(id).orElseThrow();
		sport1 = sportrepository.save(sport);
		
		return sport1;
		
		
	}
	
	
	
}
