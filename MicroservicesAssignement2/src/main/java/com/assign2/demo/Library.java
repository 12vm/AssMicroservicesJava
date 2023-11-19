package com.assign2.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class Library {
	@Autowired
     Book book;
	
	public void displayBookDetails() {
		System.out.println(book.getAuthor());
		System.out.println(book.getTitle());
	}
}
