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

import com.movies.models.Salle;
import com.movies.models.Salle;
import com.movies.service.GeneriqueService;


@RestController
@RequestMapping("salles")
public class SalleController {
	
	@Autowired
	private GeneriqueService<Salle> generiqueService;
	
	
	
	
	
	
	
	@GetMapping()
	public List<Salle> getALL() {
		return generiqueService.getAll() ;
	}
	@GetMapping("{id}")
	public Salle getbyId(@PathVariable String id) {
		return this.generiqueService.getById(id); 
		
	}
	
	@PostMapping()
	public Salle save(@RequestBody Salle salle ) {

		return generiqueService.create(salle);
	}
	
	@PatchMapping()
	public Salle update( @RequestBody Salle salle) {
		return this.generiqueService.update(salle);
		
	}
	
	@DeleteMapping("{id}")
	public void delete(@PathVariable String id) {
		this.generiqueService.delete(id);;
		
	}
	

}
