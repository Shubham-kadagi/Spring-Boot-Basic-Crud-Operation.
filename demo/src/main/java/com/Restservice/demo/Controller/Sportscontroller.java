package com.Restservice.demo.Controller;

import java.util.List;
import java.lang.Long;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Restservice.demo.Entity.Sport;
import com.Restservice.demo.Service.Sportservice;

@RestController
public class Sportscontroller {
	
	@Autowired
	public Sportservice sportservice;
	
	public Sportscontroller(Sportservice sportservice) 
	{
		this.sportservice = sportservice;
	}
	
	
	
// Controllers part start from here
	

	@GetMapping("/Sport")
	public List<Sport>getsport()
	{
		
	 return sportservice.getsport();
		
	}
	
	
	// Post Controller
	
	
	@PostMapping ("/Sports")
	public String addsport(@RequestBody Sport sport) 

	{
		
		  sportservice.addsport(sport);
		
		return" Sport added Successfully";
			
	}
	
	
	
	@PutMapping ("/sport/{id}")
	public Sport updatesport(@PathVariable Long id, @RequestBody Sport sport) {
		
		return sportservice.updatesport(id, sport);
		
	
		}
	

}
