package com.Restservice.demo.Repository;
import java.lang.Long;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Restservice.demo.Entity.Sport;


@Repository
public interface Sportrepository extends JpaRepository<Sport, Long> {
	
	

}
