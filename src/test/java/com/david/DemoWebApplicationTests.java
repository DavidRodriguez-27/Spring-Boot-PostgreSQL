package com.david;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

import com.david.model.Usuario;
import com.david.repo.IUsuarioRepo;

@RunWith(SpringRunner.class)
@SpringBootTest
class DemoWebApplicationTests {
	
	@Autowired
	private IUsuarioRepo repo;
	
	@Autowired
	private BCryptPasswordEncoder encoder;

	@Test
	public void crearUsuarioTest() {
		Usuario us = new Usuario();
		us.setId(2);
		us.setNombre("Miguel");
		us.setClave(encoder.encode("2021"));
		Usuario retorno = repo.save(us);
		
		assertTrue(retorno.getClave().equalsIgnoreCase(us.getClave()));
	}

}
