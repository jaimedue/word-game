package com.example;

public class WordNotFoundException extends RuntimeException {
	public WordNotFoundException(Long id) {
	    super("Could not find word with id: " + id);
	  }
}
