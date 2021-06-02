package com.movies.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movies.models.Film;
import com.movies.models.Film;
import com.movies.service.GeneriqueService;


@RestController
@RequestMapping("films")
public class FilmController {
	
	@Autowired
	private GeneriqueService<Film> generiqueService;
	
	
	
	
	
	
	
	@GetMapping()
	public List<Film> getALL() {
		return generiqueService.getAll() ;
	}
	@GetMapping("{id}")
	public Film getbyId(@PathVariable String id) {
		return this.generiqueService.getById(id); 
		
	}
	
	@PostMapping()
	public Film save(@RequestBody Film film ) {

		return generiqueService.create(film);
	}
	
	@PatchMapping()
	public Film update( @RequestBody Film film) {
		return this.generiqueService.update(film);
		
	}
	
	@DeleteMapping("{id}")
	public void delete(@PathVariable String id) {
		this.generiqueService.delete(id);;
		
	}
	

}
