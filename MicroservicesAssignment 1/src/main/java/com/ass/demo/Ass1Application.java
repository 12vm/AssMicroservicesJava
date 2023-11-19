package com.ass.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Ass1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ac=SpringApplication.run(Ass1Application.class, args);
		Student st=ac.getBean(Student.class);
		st.setId(20);
		st.setName("Veid");
		st.setScore(230);
		StudentService ss=ac.getBean(StudentService.class);
		ss.addStudentData(st);
		ss.getAllStudent();
		ac.close();
	}

}
