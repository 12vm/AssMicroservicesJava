package com.assign2.demo;

import org.springframework.stereotype.Component;


public class Book {
  public Book(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}
public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
String title;
  String author;
}
