package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Word;
import com.example.service.WordServiceInterface;

@RestController()
@RequestMapping("/api/words")
public class WordController {
	
	@Autowired
    public WordServiceInterface service;
	
	@GetMapping("")
	public List<Word> getAllWords() {
	    return service.findAll();
	}

	@GetMapping("{id}")
	public Word getWord(@PathVariable Long id) {
	    return service.findById(id);
	  }
	
	@GetMapping("/quiz")
	public List<Word> getQuiz() {
		return service.findAllRandom();
	}

	@GetMapping("/quiz/word")
	public Word getQuizWord() {
		return service.findRandom();
	}
}
