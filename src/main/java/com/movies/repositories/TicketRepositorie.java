package com.movies.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.movies.models.Cinema;
import com.movies.models.Ticket;

public interface TicketRepositorie extends MongoRepository<Ticket, String> {
	
	
	

}
