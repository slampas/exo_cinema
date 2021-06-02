package com.movies.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.movies.models.Cinema;
import com.movies.models.Salle;
import com.movies.repositories.SalleRepositorie;
import com.movies.repositories.SeanceRepositorie;
import com.movies.service.GeneriqueService;

public class SalleServiceImpl  implements GeneriqueService<Salle> {

	
	@Autowired
	private SalleRepositorie SalleRepository ;
	
	
	@Override
	public List<Salle> getAll() {
		// TODO Auto-generated method stub
		return SalleRepository.findAll();
	}

	@Override
	public Salle getById(String id) {
		// TODO Auto-generated method stub
		return SalleRepository.findById(id).get();
	}

	@Override
	public Salle create(Salle t) {
		// TODO Auto-generated method stub
		return SalleRepository.save(t);
	}

	@Override
	public Salle update(Salle t) {
		// TODO Auto-generated method stub
		return SalleRepository.save(t);
	}

	@Override
	public void delete(String id) {
		this.SalleRepository.deleteById(id);
		
	}

}
