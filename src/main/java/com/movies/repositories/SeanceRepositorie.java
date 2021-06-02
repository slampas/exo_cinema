package com.movies.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.movies.models.Seance;

public interface SeanceRepositorie extends MongoRepository<Seance, String>  {

}
