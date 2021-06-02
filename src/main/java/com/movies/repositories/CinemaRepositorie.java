package com.movies.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;


import com.movies.models.Cinema;

public interface CinemaRepositorie extends MongoRepository<Cinema, String> {

}
