package com.ass.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class StudentService implements InitializingBean , DisposableBean{
	
   
    
	List<Student> studentList=new <Student>ArrayList();
	public StudentService() {
		System.out.println("Constuctor ");
	}
	
	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}
    
	public void addStudentData(Student student) {
		studentList.add(student);
	}
	
	public void getAllStudent(){
	  for(Student student: studentList) {
		  System.out.println(student.getId());
		  System.out.println(student.getName());
		  System.out.println(student.getScore());
		  
	  }
	}
	
	public Student getStudentById(int id,Student st){
		
		  for(Student student: studentList) {
			    if(student.getId()==id) {
			    	st=student;
			    }
		  }
		  return st;
		}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Student Service is initialized");
		
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Student Service is being destroyed");
		
	}
	
	public void scoringSystem(Student st) {
		if(st.getScore()<50) {
			System.out.println("Student is below average");
		}
		if(st.getScore()>=50 && st.getScore()<75) {
			System.out.println("Student average");
		}
		
		if(st.getScore()>=75) {
			System.out.println("Student is above average");
		}
	}

	
	
	
}
