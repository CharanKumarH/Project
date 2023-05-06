package com.prog.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/std")
public class StudentController {
	
	@GetMapping("/student")
	public Student getStudent(){
		
		return new Student("aaa", "bbb");
	}
	
	@GetMapping("/students")
	public List<Student> getStudents(){
		List<Student> students = new ArrayList<>();
		students.add(new Student ("CCC","ddd"));
		students.add(new Student ("EEE","fff"));
		students.add(new Student ("GGG","hhh"));
		students.add(new Student ("III","jjj"));
		return students;
	}

}
