package com.example.easynotes.repository;

import com.example.easynotes.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Created by ShobhanMandal on 28/10/2023.


@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {

}
