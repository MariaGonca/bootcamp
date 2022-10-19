package com.bootcamp.bootcamp;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Component
public class NoteDaoService {

	private static List<Note> notes = new ArrayList<>();
	
	static {
		notes.add(new Note(1, "Test1", LocalDate.now(), LocalDate.now(), LocalDate.now(), "Link1", "Mention1", 1));
		notes.add(new Note(2, "Test2", LocalDate.now(), LocalDate.now(), LocalDate.now(), "Link2", "Mention2", 1));
	}
	
	public List<Note> findAll(){
		return notes;
	}

	public Note findOne(int id) {
		Predicate<? super Note> predicate = note -> note.getId() == id;
		return notes.stream().filter(predicate).findFirst().get();
	}
	
	public void deleteById(int id) {
		Predicate<? super Note> predicate = note -> note.getId() == id;
		notes.removeIf(predicate);
	}
	
	public Note save(Note note) {
		notes.add(note);
		return note;
	}
}
