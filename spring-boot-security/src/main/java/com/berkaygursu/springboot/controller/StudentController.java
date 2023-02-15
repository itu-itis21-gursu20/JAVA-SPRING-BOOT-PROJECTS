package com.berkaygursu.springboot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.berkaygursu.springboot.model.Student;

@RestController
public class StudentController {

	public List<Student> students = new ArrayList<>();
	
	@GetMapping("/students")
	public List<Student> students() {
		
		Student student1 = new Student(); 
		student1.setId(1);
		student1.setFirstName("Berkay");
		student1.setLastName("Gürsu");
		
		Student student2 = new Student(); 
		student2.setId(2);
		student2.setFirstName("Arda");
		student2.setLastName("Ağdaş");
		
		Student student3 = new Student(); 
		student3.setId(3);
		student3.setFirstName("Ahmetcan");
		student3.setLastName("Sezen");
		
		students.add(student1);
		students.add(student2);
		students.add(student3);
		
		return students;
	}
	
	@PreAuthorize("hasRole('ADMIN')") // only those having ADMIN role can add new student
	@PostMapping("/students")
	public Student createStudent(@RequestBody Student student) {
		students.add(student);
		return student;
	}
	
	 //@PreAuthorize("hasRole('CAPTAIN')")
	 @GetMapping("/captain/destination")
	 public String currentDestination() {
		 return "Earth";
	 }
	 
	 @GetMapping("/crew/work")
	 public String menu() {
		 return "Microwaved pizza";
	 }
	 
}
