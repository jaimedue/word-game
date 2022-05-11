package com.example.service;

import java.util.List;

import com.example.model.Word;

public interface WordServiceInterface {
	
	List<Word> findAll();
	Word findById(Long id);
	List<Word> findAllRandom();
	Word findRandom();
}
