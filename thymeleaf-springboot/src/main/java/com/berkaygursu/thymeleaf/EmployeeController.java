package com.berkaygursu.thymeleaf;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {

	@GetMapping("/iteration")
	public String iteration(Model model) {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee("sinan", "engin", "sinan.engin@beyaztv.com.tr"));
		employees.add(new Employee("ahmet", "çakar", "ahmet.cakar@beyaztv.com.tr"));
		employees.add(new Employee("ertem", "şener", "ertem.sener@beyaztv.com.tr"));
		employees.add(new Employee("abdülkerim", "durmaz", "abd.durmaz@beyaztv.com.tr"));
		employees.add(new Employee("rasim ozan", "kütahyalı", "rok@beyaztv.com.tr"));
		model.addAttribute("employees", employees);
		return "iteration";
		
	}
	
}
