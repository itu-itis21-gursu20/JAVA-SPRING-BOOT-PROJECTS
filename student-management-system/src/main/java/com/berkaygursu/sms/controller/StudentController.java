package com.berkaygursu.sms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import com.berkaygursu.sms.entity.Student;
import com.berkaygursu.sms.service.StudentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
public class StudentController {
	
	private StudentService studentService;

	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	
	@GetMapping("/students") // after redirecting by saveStudent method, this method works
	public String listStudents(Model model) {
		model.addAttribute("students", studentService.getAllStudents());
		return "students";
	}
	
	@GetMapping("/students/new")
	public String createStudentForm(Model model) {
		Student student = new Student(); // student data coming from form will be hold with this empty object 
		model.addAttribute("student", student);
		return "create-student"; // it will go to create-student.html page
	}
	
	@PostMapping("/students") // after submitting form, student model came here with POST method
	public String saveStudent(@ModelAttribute("student") Student student) {
		studentService.saveStudent(student);
		return "redirect:/students"; // it redirects to students end-point and student.html is showed with getmapping
	}
	
	@GetMapping("/students/edit/{id}") // we use @PathVariable to handle id in this path
	public String editStudentForm(@PathVariable Long id, Model model) {
		model.addAttribute("student", studentService.getStudentById(id));
		return "edit-student";
	}
	
	@PostMapping("/students/{id}")
	public String updateStudent(@ModelAttribute Student student, @PathVariable Long id, Model model) {
		Student existingStudent = studentService.getStudentById(id);
		existingStudent.setId(id);
		existingStudent.setFirstName(student.getFirstName()); // updated student object came from form
		existingStudent.setLastName(student.getLastName());
		existingStudent.setEmail(student.getEmail());
		
		studentService.updateStudent(existingStudent);
		
		return "redirect:/students";
	}
	
	@GetMapping("/students/delete/{id}")
	public String deleteStudent(@PathVariable Long id) {
		studentService.deleteStudentById(id);	
		return "redirect:/students";
	} 
	
	
}
