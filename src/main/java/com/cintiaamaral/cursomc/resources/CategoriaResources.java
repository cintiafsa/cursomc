package com.cintiaamaral.cursomc.resources;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cintiaamaral.cursomc.domain.Categoria;
import com.cintiaamaral.cursomc.services.CategoriaService;

@RestController
@RequestMapping (value="/categorias")

public class CategoriaResources {
	
	@Autowired
	private CategoriaService service;
	
	@RequestMapping (value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> buscar(@PathVariable Integer id) {
		
		Categoria obj = service.buscar(id);
		return ResponseEntity.ok().body(obj);
			
	}

}
