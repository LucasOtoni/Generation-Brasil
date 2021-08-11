package br.org.generation.farmacia.controller;

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

import br.org.generation.farmacia.model.CategoriaModel;
import br.org.generation.farmacia.repository.CategoriaRepository;

@RestController
@RequestMapping("/categorias")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CategoriaController {

	@Autowired
	private CategoriaRepository categoriaRepository; 
	
	@GetMapping
	private ResponseEntity<List<CategoriaModel>> getAll() {
		return ResponseEntity.ok(categoriaRepository.findAll()); 
	}
	
	@GetMapping("/{id}")
	private ResponseEntity<CategoriaModel> getById(@PathVariable long id) {
		return categoriaRepository.findById(id).map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build()); 
	}
	
	@GetMapping("/tipo/{tipo}")
	public ResponseEntity<List<CategoriaModel>> getByTipo(@PathVariable String tipo){
		return ResponseEntity.ok(categoriaRepository.findAllBytipoContainingIgnoreCase(tipo));
	}
	
	@PostMapping
	public ResponseEntity<CategoriaModel> post(@RequestBody CategoriaModel categoria){
		return ResponseEntity.status(HttpStatus.CREATED).body(categoriaRepository.save(categoria)); 
	}
	
	@PutMapping
	public ResponseEntity<CategoriaModel> put(@RequestBody CategoriaModel categoria){
		return ResponseEntity.status(HttpStatus.OK).body(categoriaRepository.save(categoria)); 
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		categoriaRepository.deleteById(id);
	}
}
