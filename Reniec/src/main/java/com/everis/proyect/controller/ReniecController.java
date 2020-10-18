package com.everis.proyect.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everis.proyect.entity.Reniec;

@RestController
@RequestMapping("/external/reniec")
public class ReniecController {
	@Value("${entityName}") String entityName;
	@Value("${success}") boolean success;
	@PostMapping("/validate")
	public ResponseEntity<Reniec> getReniec(@RequestBody String document){
		Reniec reniec = new Reniec(entityName,success);
		return ResponseEntity.ok(reniec);
	}
}
