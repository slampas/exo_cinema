package com.movies.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.movies.models.Cinema;
import com.movies.models.Salle;

public interface SalleRepositorie extends MongoRepository<Salle, String> {

}
