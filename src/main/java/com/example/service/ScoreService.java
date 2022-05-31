package com.example.service;

import java.util.List;
import java.util.Optional;

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
	public Score findById(Long id) {
		Optional<Score> result = repository.findById(id);
		if (result.isPresent()) {
			return result.get();
		} else {
			return null;
		}
	}
}
