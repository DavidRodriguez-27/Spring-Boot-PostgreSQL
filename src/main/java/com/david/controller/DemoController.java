package com.david.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.david.model.Persona;
import com.david.repo.IPersonaRepo;

@Controller
public class DemoController {

	@Autowired
	private IPersonaRepo repo;
	
	@GetMapping("/greeting")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		//logica
		
		Persona p = new Persona();
		p.setIdPersona(2);
		p.setNombre("Jose");
		repo.save(p);
		
		model.addAttribute("name", name);
		return "greeting";
	}
	
	@GetMapping("/listar")
	public String greeting(Model model) {
		//logica
		
		model.addAttribute("personas", repo.findAll());
		return "greeting";
	}
	
}
