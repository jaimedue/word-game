package com.example.service;

import java.util.List;

import com.example.model.Score;

public interface ScoreServiceInterface {
	
	Score create(Score s);
	List<Score> findAll();
	Score findById(Long id);
}
