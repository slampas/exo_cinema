package com.movies.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.movies.models.Cinema;
import com.movies.models.Seance;
import com.movies.repositories.SeanceRepositorie;
import com.movies.repositories.TicketRepositorie;
import com.movies.service.GeneriqueService;

public class SeanceServiceImpl  implements GeneriqueService<Seance> {

	
	@Autowired
	private SeanceRepositorie SeanceRepository ;
	
	@Override
	public List<Seance> getAll() {
		// TODO Auto-generated method stub
		return SeanceRepository.findAll();
	}

	@Override
	public Seance getById(String id) {
		// TODO Auto-generated method stub
		return SeanceRepository.findById(id).get();
	}

	@Override
	public Seance create(Seance t) {
		// TODO Auto-generated method stub
		return SeanceRepository.save(t);
	}

	@Override
	public Seance update(Seance t) {
		// TODO Auto-generated method stub
		return SeanceRepository.save(t);
	}

	@Override
	public void delete(String id) {
		this.SeanceRepository.deleteById(id);
		
	}

}
