package com.espertacasa.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.espertacasa.icasa.model.classes.Usuario;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/Usuario")
public class UsuarioRestController {

	@PostMapping
	public ResponseEntity<?> inserir(@RequestBody Usuario usuario) {

		return new ResponseEntity<>(HttpStatus.OK);

	}
	
	@PutMapping
	public ResponseEntity<?> alterar(@RequestBody Usuario usuario){
		
		return new ResponseEntity<>(HttpStatus.OK);
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Usuario> ler(@PathVariable("id") String id){
		
		Usuario usuario = new Usuario();
		
		return new ResponseEntity<Usuario>(usuario, HttpStatus.OK);
		
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deletar(@PathVariable("id") String id){
		
		return new ResponseEntity<>(HttpStatus.OK);
		
	}

}
