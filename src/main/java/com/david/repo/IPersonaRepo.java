package com.david.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.david.model.Persona;

public interface IPersonaRepo extends JpaRepository<Persona, Integer>{

}
