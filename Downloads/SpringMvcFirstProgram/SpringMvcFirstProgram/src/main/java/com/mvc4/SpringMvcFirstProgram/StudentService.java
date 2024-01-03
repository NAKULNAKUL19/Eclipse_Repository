package com.mvc4.SpringMvcFirstProgram;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
@Service
public class StudentService {
	
	
	
	
public List<Object> getStudent()
{
	 System.out.println("I run first I'm Student Service class");
	 
	 
	 
	 
	 
	 Student nakul=new Student("nakul",23,123233);
	 Student mangesh=new Student("mangesh",23,123233);
	 Student rangesh=new Student("rangesh",24,12311);
	System.out.println(nakul);
return List.of(nakul,mangesh,rangesh);
}


}
