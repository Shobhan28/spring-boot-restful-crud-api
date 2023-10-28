package com.example.easynotes.controller;

import com.example.easynotes.entity.Note;
import com.example.easynotes.exception.ResourceNotFoundException;
import com.example.easynotes.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by ShobhanMandal on 28/10/2023.
 */
@RestController
@RequestMapping("/api")
public class NoteController {

    @Autowired
    NoteRepository noteRepository;

 //   http://localhost:8080/api/createnotes
    @PostMapping("/createnotes")
    public Note createNote(@Valid @RequestBody Note note) {
        return noteRepository.save(note);
    }
    
    //   http://localhost:8080/api/getnotes
        @GetMapping("/getnotes")
        public List<Note> getAllNotes() {
            return noteRepository.findAll();
        }


//   http://localhost:8080/api/getnotes/id
    @GetMapping("/getnotesby/{id}")
    public Note getNoteById(@PathVariable(value = "id") Long noteId) {
        return noteRepository.findById(noteId)
                .orElseThrow(() -> new ResourceNotFoundException("Note", "id", noteId));
    }


    //   http://localhost:8080/api/updatenotes/id
    @PutMapping("/updatenotes/{id}")
    public Note updateNote(@PathVariable(value = "id") Long noteId, @Valid @RequestBody Note noteDetails) {

        Note note = noteRepository.findById(noteId)
                .orElseThrow(() -> new ResourceNotFoundException("Note", "id", noteId));

        note.setTitle(noteDetails.getTitle());
        note.setContent(noteDetails.getContent());

        Note updatedNote = noteRepository.save(note);
        return updatedNote;
    }


//    http://localhost:8080/api/deletenotes/id
    @DeleteMapping("/deletenotes/{id}")
    public ResponseEntity<?> deleteNote(@PathVariable(value = "id") Long noteId) {
        Note note = noteRepository.findById(noteId)
                .orElseThrow(() -> new ResourceNotFoundException("Note", "id", noteId));

        noteRepository.delete(note);

        return new ResponseEntity<>(note, HttpStatus.OK);
    }
}
