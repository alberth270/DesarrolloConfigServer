package com.everis.springboot.server;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pruebas")
public class pruebasController {
	@GetMapping("/helloworld")
	public ResponseEntity<String> helloWorld(){
		return ResponseEntity.ok("hola mundo");
	}
}
