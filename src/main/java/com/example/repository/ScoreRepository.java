package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.model.Score;

@Repository
public interface ScoreRepository extends JpaRepository<Score, Long> {
	
	@Query(
			value = "SELECT * FROM scores ORDER BY score DESC LIMIT 5",
			nativeQuery = true
	)
	List<Score> findTop5();

	@Query (
		value = "SELECT score FROM (SELECT * FROM scores ORDER BY score DESC LIMIT 5) ORDER BY score ASC LIMIT 1",
		nativeQuery = true
	)
	int findMinHighScore();
}
