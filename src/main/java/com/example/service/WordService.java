package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.WordNotFoundException;
import com.example.model.Word;
import com.example.repository.WordRepository;

@Service
public class WordService implements WordServiceInterface {
	
	@Autowired
    private WordRepository repository;
	
	@Override
	public List<Word> findAll() {
	    return repository.findAll();
	}
	
	@Override
	public Word findById(@PathVariable Long id) {
	    return repository.findById(id)
	      .orElseThrow(() -> new WordNotFoundException(id));
	  }
	
	@Override
	public List<Word> findAllRandom() {
		return repository.findAllRandom();
	}

	@Override
	public Word findRandom() {
		return repository.findRandom();
	}
}
