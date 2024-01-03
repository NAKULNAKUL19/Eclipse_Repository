package com.mvc4.SpringMvcFirstProgram;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ResponseBody
public class Controller {
	 private StudentService studentservice;

	 @Autowired
	public Controller(StudentService studentservice) {
		super();
		this.studentservice = studentservice;
	}
	 
	 @GetMapping("/controller")
	 public List<Object> studentInformation()
	 {
		 System.out.println("I run first I'm Controller Class");
	return studentservice.getStudent();
	}
	 }
	



