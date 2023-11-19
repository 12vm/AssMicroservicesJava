package com.assign2.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class ApplicationRunnerImpl implements ApplicationRunner {
	@Autowired
    Library lib;
	
	@Autowired
	Classroom cls;
	   @Override
	   public void run(ApplicationArguments arg0) throws Exception {
	      lib.displayBookDetails();
	      cls.displayStudentDetails();
	   }
	
	
	
}
