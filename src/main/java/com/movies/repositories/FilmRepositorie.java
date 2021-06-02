package com.movies.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.movies.models.Cinema;
import com.movies.models.Film;

public interface FilmRepositorie extends MongoRepository<Film, String>  {

}
