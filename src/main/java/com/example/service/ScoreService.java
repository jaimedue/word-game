package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.model.Score;
import com.example.repository.ScoreRepository;

@Service
public class ScoreService implements ScoreServiceInterface {
	
	@Autowired
	private ScoreRepository repository;

	@Override
	public Score create(Score s) {
		return repository.save(s);
	}
	
	@Override
	public List<Score> findAll() {
		return repository.findAll(Sort.by(Sort.Direction.DESC, "score"));
	}
	
	@Override
	public List<Score> findTop5() {
		return repository.findTop5();
	}

	@Override
	public int findMinHighScore() {
		return repository.findMinHighScore();
	}
}
