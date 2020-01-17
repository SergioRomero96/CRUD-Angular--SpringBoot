package com.example.SpringBootcrud.service;

import java.util.List;

import com.example.SpringBootcrud.entity.Persona;

public interface IPersonaService {
	List<Persona> getAll();
	Persona getById(int id);
	Persona save(Persona persona);
	Persona update(Persona persona);
	Persona delete(int id);
}
