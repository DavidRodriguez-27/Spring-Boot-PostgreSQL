package com.david.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.david.model.Usuario;

public interface IUsuarioRepo extends JpaRepository<Usuario, Integer>{
	
	Usuario findByNombre(String nombre);

}
