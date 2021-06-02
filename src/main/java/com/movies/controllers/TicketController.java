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

import com.movies.models.Ticket;
import com.movies.models.Ticket;
import com.movies.service.GeneriqueService;

@RestController
@RequestMapping("tickets")
public class TicketController {
	
	
	@Autowired
	private GeneriqueService<Ticket> generiqueService;
	
	
	@GetMapping()
	public List<Ticket> getALL() {
		return generiqueService.getAll() ;
	}
	@GetMapping("{id}")
	public Ticket getbyId(@PathVariable String id) {
		return this.generiqueService.getById(id); 
		
	}
	
	@PostMapping()
	public Ticket save(@RequestBody Ticket ticket ) {

		return generiqueService.create(ticket);
	}
	
	@PatchMapping()
	public Ticket update( @RequestBody Ticket ticket) {
		return this.generiqueService.update(ticket);
		
	}
	
	@DeleteMapping("{id}")
	public void delete(@PathVariable String id) {
		this.generiqueService.delete(id);;
		
	}
	
	
	
	

}
