package com.example.service;

import java.util.List;

import com.example.model.Score;

public interface ScoreServiceInterface {
	
	Score create(Score s);
	List<Score> findAll();
	List<Score> findTop5();
	int findMinHighScore();
}
