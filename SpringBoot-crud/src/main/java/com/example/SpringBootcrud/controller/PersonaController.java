package com.example.SpringBootcrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringBootcrud.entity.Persona;
import com.example.SpringBootcrud.service.IPersonaService;

@CrossOrigin(origins = {"http://localhost:4200", "*"})
@RestController
@RequestMapping("/api")
public class PersonaController {
	@Autowired
	IPersonaService service;
	
	@GetMapping("/personas")
	public List<Persona> getAll(){
		return service.getAll();
	}
	
	@PostMapping("/personas/new")
	public Persona create(@RequestBody Persona persona) {
		return service.save(persona);
	}
	
	@GetMapping("/personas/{id}")
	public Persona getById(@PathVariable("id") int id) {
		return service.getById(id);
	}
	
	@PutMapping("/personas/{id}")
	public Persona update(@RequestBody Persona persona, @PathVariable("id") int id) {
		persona.setId(id);
		return service.update(persona);
	}
}
