package com.example.model;

import javax.annotation.processing.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "words")
public class Word {
	
	private Long id;
	private String correct;
	private String wrong;
	private String define;
	
	public Word() {
		
	}
	
	public Word(String correct, String wrong, String define) {
		this.correct = correct;
		this.wrong = wrong;
		this.define = define;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@Column(name = "correct")
	public String getCorrect() {
		return correct;
	}
	public void setCorrect(String correct) {
		this.correct = correct;
	}
	
	@Column(name = "wrong")
	public String getWrong() {
		return wrong;
	}
	public void setWrong(String wrong) {
		this.wrong = wrong;
	}
	
	@Column(name = "define")
	public String getDefine() {
		return define;
	}
	public void setDefine(String define) {
		this.define = define;
	}
}
