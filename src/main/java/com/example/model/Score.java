package com.example.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "scores")
public class Score {

	private Long id;
	private String name;
	private int score;
	private Timestamp date;
	private int level;
	
	public Score() {
		
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "username")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "score")
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}

	@Column(name = "level")
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}

	@Column(name = "date")
	public Timestamp getDate() {
		return date;
	}
	public void setDate(Timestamp date) {
		this.date = date;
	}

	
	public Score(String name, int score, int level) {
		this.name = name;
		this.score = score;
		this.level = level;
	}
	
	
}

