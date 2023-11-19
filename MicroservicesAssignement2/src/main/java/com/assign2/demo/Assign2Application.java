package com.assign2.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;



@SpringBootApplication
public class Assign2Application {
	
	@Bean
	public Student studentBean() {
		return new Student("veid",22);
	}
	@Bean
	public Library libraryBean() {
		return new Library();
	}
	@Bean
	public Book bookBean() {
		return new Book("ddd","sss");
	}
	@Bean
	public Classroom classroomBean() {
		return new Classroom(studentBean());
	}

	public static void main(String[] args) {
		ConfigurableApplicationContext ac=SpringApplication.run(Assign2Application.class, args);
		
		
		
		
		ac.close();
	}

}
