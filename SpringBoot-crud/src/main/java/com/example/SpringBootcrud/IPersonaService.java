package com.example.SpringBootcrud;

import java.util.List;

public interface IPersonaService {
	List<Persona> getAll();
	Persona getById(int id);
	Persona add(Persona persona);
	Persona edit(Persona persona);
	Persona delete(int id);
}
