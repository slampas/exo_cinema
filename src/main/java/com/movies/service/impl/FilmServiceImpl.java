package com.movies.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.movies.models.Cinema;
import com.movies.models.Film;
import com.movies.repositories.FilmRepositorie;
import com.movies.repositories.SeanceRepositorie;
import com.movies.service.GeneriqueService;

public class FilmServiceImpl implements GeneriqueService<Film> {
	
	@Autowired
	private FilmRepositorie filmRepository ;

	@Override
	public List<Film> getAll() {
		// TODO Auto-generated method stub
		return filmRepository.findAll();
	}

	@Override
	public Film getById(String id) {
		// TODO Auto-generated method stub
		return filmRepository.findById(id).get();
	}

	@Override
	public Film create(Film t) {
		// TODO Auto-generated method stub
		return filmRepository.save(t);
	}

	@Override
	public Film update(Film t) {
		// TODO Auto-generated method stub
		return filmRepository.save(t);
	}

	@Override
	public void delete(String id) {
		this.filmRepository.deleteById(id);
		
	}


}
