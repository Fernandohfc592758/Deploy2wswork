package org.wswork.carro.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
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
import org.wswork.carro.model.Modelo;
import org.wswork.carro.repository.ModeloRepository;

@RestController
@RequestMapping("/modelo")
@CrossOrigin("*")
public class ModeloController {
	
	@Autowired
	private ModeloRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Modelo>> GetAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@PostMapping
	public ResponseEntity<Modelo> postModelo (@RequestBody Modelo modelo){ 
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(modelo));
	}
	
	
	
	@GetMapping("/{id}")
	public ResponseEntity<Modelo> GetById(@PathVariable long id){
		return repository.findById(id)
				.map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/modelo/{modelo}")
	public ResponseEntity<List<Modelo>> GetByModelo(@PathVariable String modelo){
		return ResponseEntity.ok(repository.findAllByModeloContainingIgnoreCase(modelo));
	}
	
	@PutMapping
	public ResponseEntity<Modelo> put (@RequestBody Modelo modelo){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(modelo));	
	}
	
	
	@DeleteMapping ("/{id}")     
	public void delete(@PathVariable long id) {                 
		repository.deleteById(id);
	}

}
