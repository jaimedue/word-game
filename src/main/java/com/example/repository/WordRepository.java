package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.model.Word;

@Repository
public interface WordRepository extends JpaRepository<Word, Long>{

	@Query(
			value = "SELECT * FROM words ORDER BY RANDOM()",
			nativeQuery = true
	)
	List<Word> findAllRandom();

	@Query(
			value = "SELECT * FROM words ORDER BY RANDOM() LIMIT 1",
			nativeQuery = true
	)
	Word findRandom();
	
}
