package com.example.SpringBootcrud.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.SpringBootcrud.entity.Persona;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona, Integer>{
	List<Persona> findAll();
	Persona save(Persona persona);
	Persona findById(int id);
	void delete(Persona persona);
}
