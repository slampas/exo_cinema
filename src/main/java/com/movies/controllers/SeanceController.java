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

import com.movies.models.Seance;
import com.movies.models.Seance;
import com.movies.service.GeneriqueService;

@RestController
@RequestMapping("seances")
public class SeanceController {
	
	@Autowired
	private GeneriqueService<Seance> generiqueService;
	
	
	
	
	
	
	
	@GetMapping()
	public List<Seance> getALL() {
		return generiqueService.getAll() ;
	}
	@GetMapping("{id}")
	public Seance getbyId(@PathVariable String id) {
		return this.generiqueService.getById(id); 
		
	}
	
	@PostMapping()
	public Seance save(@RequestBody Seance seance ) {

		return generiqueService.create(seance);
	}
	
	@PatchMapping()
	public Seance update( @RequestBody Seance seance) {
		return this.generiqueService.update(seance);
		
	}
	
	@DeleteMapping("{id}")
	public void delete(@PathVariable String id) {
		this.generiqueService.delete(id);;
		
	}
	

}
