package com.bootcamp.bootcamp;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	private NoteDaoService service;
	
	public Controller(NoteDaoService service) {
		this.service = service;
	}
	
	@GetMapping("/notes")
	public List<Note> retrieveAllNotes(){
		return service.findAll();
	}
	
	@GetMapping("/notes/{id}")
	public Note retrieveNote(@PathVariable int id){
		return service.findOne(id);
	}
	
	@PostMapping("/notes")
	public ResponseEntity<Object> createNote(@RequestBody Note note) {
		service.save(note);
		return ResponseEntity.created(null).build();
	}
	
	@DeleteMapping("/notesDelete/{id}")
	public void deleteNote(@PathVariable int id){
		service.deleteById(id);
	}
}
