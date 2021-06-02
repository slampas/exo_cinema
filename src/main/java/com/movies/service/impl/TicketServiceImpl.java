package com.movies.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.movies.models.Ticket;
import com.movies.repositories.CinemaRepositorie;
import com.movies.repositories.TicketRepositorie;
import com.movies.service.GeneriqueService;

public class TicketServiceImpl implements GeneriqueService<Ticket> {


	@Autowired
	private TicketRepositorie ticketRepository ;
	
	
	@Override
	public List<Ticket> getAll() {
		// TODO Auto-generated method stub
		return ticketRepository.findAll();
	}

	@Override
	public Ticket getById(String id) {
		// TODO Auto-generated method stub
		return ticketRepository.findById(id).get();
	}

	@Override
	public Ticket create(Ticket t) {
		// TODO Auto-generated method stub
		return ticketRepository.save(t);
	}

	@Override
	public Ticket update(Ticket t) {
		// TODO Auto-generated method stub
		return ticketRepository.save(t);
	}

	@Override
	public void delete(String id) {
		this.ticketRepository.deleteById(id);
		
	}

}
