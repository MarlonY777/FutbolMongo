package com.FutbolCrud.demo.App.Repositorio;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.FutbolCrud.demo.App.Entity.Entrenadores;

public interface EntrenadorRepository extends MongoRepository<Entrenadores, String>{
	boolean existsByNombre(String nombre);
}