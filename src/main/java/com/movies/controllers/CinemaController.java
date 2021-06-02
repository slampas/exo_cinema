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

import com.movies.models.Cinema;
import com.movies.service.GeneriqueService;



@RestController
@RequestMapping("cinemas")
public class CinemaController {
	
	
	
	@Autowired
	private GeneriqueService<Cinema> generiqueService;
	
	
	
	
	
	
	
	@GetMapping()
	public List<Cinema> getALL() {
		return generiqueService.getAll() ;
	}
	@GetMapping("{id}")
	public Cinema getbyId(@PathVariable String id) {
		return this.generiqueService.getById(id); 
		
	}
	
	@PostMapping()
	public Cinema save(@RequestBody Cinema cinema ) {

		return generiqueService.create(cinema);
	}
	
	@PatchMapping()
	public Cinema update( @RequestBody Cinema cinema) {
		return this.generiqueService.update(cinema);
		
	}
	
	@DeleteMapping("{id}")
	public void delete(@PathVariable String id) {
		this.generiqueService.delete(id);;
		
	}
	

	

}
