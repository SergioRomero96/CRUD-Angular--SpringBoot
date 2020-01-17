package com.example.SpringBootcrud;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImp implements IPersonaService{
	@Autowired
	private IPersonaRepository personaRepository;
	
	
	@Override
	public List<Persona> getAll() {
		// TODO Auto-generated method stub
		return personaRepository.findAll();
	}

	@Override
	public Persona getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Persona add(Persona persona) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Persona edit(Persona persona) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Persona delete(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
