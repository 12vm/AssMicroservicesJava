package com.ass.demo;

import org.springframework.stereotype.Component;

@Component
public class Student {
	int id;
	String name;
	double score;
	
	
	
   public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}

 
}
