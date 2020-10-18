package com.everis.proyect.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everis.proyect.entity.Fingerprint;


@RestController
@RequestMapping("/core/fingerprints")
public class FingerprintController {
	@Value("${entityName}") String entityName;
	@Value("${success}") boolean success;
	@PostMapping("/validate")
	public ResponseEntity<Fingerprint> getReniec(@RequestBody String document){
		Fingerprint fingerprint= new Fingerprint(entityName,success);
		return ResponseEntity.ok(fingerprint);
	}
}
