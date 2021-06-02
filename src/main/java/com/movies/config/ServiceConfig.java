package com.movies.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.movies.models.Cinema;
import com.movies.models.Film;
import com.movies.models.Salle;
import com.movies.models.Seance;
import com.movies.models.Ticket;
import com.movies.service.GeneriqueService;
import com.movies.service.impl.CinemaServiceImpl;
import com.movies.service.impl.FilmServiceImpl;
import com.movies.service.impl.SalleServiceImpl;
import com.movies.service.impl.SeanceServiceImpl;
import com.movies.service.impl.TicketServiceImpl;




@Configuration
public class ServiceConfig {

	
	
	/**
	 * avec un service generique 
	 * @return
	 */
	@Bean
	public GeneriqueService<Cinema> CinemaServiceFactory() {
		return new CinemaServiceImpl();
		
	}
	
	
	
	/**
	 * avec un service generique 
	 * @return
	 */
	@Bean
	public GeneriqueService<Seance> SeanceServiceFactory() {
		return new SeanceServiceImpl();
		
	}
	
	
	
	/**
	 * avec un service generique 
	 * @return
	 */
	@Bean
	public GeneriqueService<Ticket> TicketServiceFactory() {
		return new TicketServiceImpl();
		
	}
	
	
	/**
	 * avec un service generique 
	 * @return
	 */
	@Bean
	public GeneriqueService<Film> FilmServiceFactory() {
		return new FilmServiceImpl();
		
	}
	
	/**
	 * avec un service generique 
	 * @return
	 */
	@Bean
	public GeneriqueService<Salle> SalleServiceFactory() {
		return new SalleServiceImpl();
		
	}
	
	
	
	
	

}