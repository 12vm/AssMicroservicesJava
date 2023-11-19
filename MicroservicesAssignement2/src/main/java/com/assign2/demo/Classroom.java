package com.assign2.demo;

import org.springframework.beans.factory.annotation.Autowired;

public class Classroom {
	Student st;
	
	@Autowired
	public Classroom(Student st) {
		super();
		this.st = st;
	}

	
	public void displayStudentDetails() {
		System.out.println(st.getAge());
		System.out.println(st.getName());
	}
	

}
