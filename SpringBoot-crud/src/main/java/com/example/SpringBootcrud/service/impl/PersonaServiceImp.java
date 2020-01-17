package com.example.SpringBootcrud.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringBootcrud.entity.Persona;
import com.example.SpringBootcrud.repository.IPersonaRepository;
import com.example.SpringBootcrud.service.IPersonaService;

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
		return personaRepository.findById(id);
	}

	@Override
	public Persona save(Persona persona) {
		// TODO Auto-generated method stub
		return personaRepository.save(persona);
	}

	@Override
	public Persona update(Persona persona) {
		// TODO Auto-generated method stub
		return personaRepository.save(persona);
	}

	@Override
	public Persona delete(int id) {
		// TODO Auto-generated method stub
		Persona persona = personaRepository.findById(id);
		if(persona != null) {
			personaRepository.delete(persona);
		}
		return persona;
	}

}
