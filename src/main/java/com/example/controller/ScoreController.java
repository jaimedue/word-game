package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.model.Score;
import com.example.service.ScoreService;

@RestController()
@RequestMapping("/api/scores")
public class ScoreController {

		@Autowired
		public ScoreService service;
		
		@PostMapping("")
		public Score addScore(@RequestBody Score score) {
			return service.create(score);
		}
		
		@GetMapping("")
		public List<Score> getAllScores() {
			return service.findAll();
		}
		
		@GetMapping("/{id}")
		public Score getScore(@PathVariable Long id) {
			return service.findById(id);
		}
}
