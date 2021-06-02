package com.movies.service;

import java.util.List;


public interface GeneriqueService<T> {

	
	
	 List<T> getAll() ;
	
	 T getById(String id);
	
	 T create(T t);
	
	 T update(T t);
	
	 void delete(String id);
	

}