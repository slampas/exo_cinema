package com.movies.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.movies.models.Cinema;
import com.movies.repositories.CinemaRepositorie;
import com.movies.service.GeneriqueService;

public class CinemaServiceImpl implements GeneriqueService<Cinema> {

	
	@Autowired
	private CinemaRepositorie cinemaRepository ;
	
	@Override
	public List<Cinema> getAll() {
		// TODO Auto-generated method stub
		return cinemaRepository.findAll();
	}

	@Override
	public Cinema getById(String id) {
		// TODO Auto-generated method stub
		return cinemaRepository .findById(id).get();
	}

	@Override
	public Cinema create(Cinema t) {
		// TODO Auto-generated method stub
		return cinemaRepository.save(t);
	}

	@Override
	public Cinema update(Cinema t) {
		// TODO Auto-generated method stub
		return cinemaRepository.save(t);
	}

	@Override
	public void delete(String id) {
		this.cinemaRepository.deleteById(id);
		
	}
	

}
