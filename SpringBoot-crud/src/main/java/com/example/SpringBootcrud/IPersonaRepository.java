package com.example.SpringBootcrud;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona, Integer>{
	List<Persona> findAll();
	Persona save(Persona persona);
	void delete(Persona persona);
}
