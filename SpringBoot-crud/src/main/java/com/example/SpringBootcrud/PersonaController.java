package com.example.SpringBootcrud;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = {"http://localhost:4200", "*"})
@RestController
@RequestMapping("/api")
public class PersonaController {
	@Autowired
	IPersonaService service;
	
	@GetMapping("/personas")
	public List<Persona> listar(){
		return service.getAll();
	}
}
