package com.berkaygursu.thymeleaf;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
	
	@GetMapping("/if-unless")
	public String ifUnless(Model model) {
		List<User> users = new ArrayList<>();
		users.add(new User("sinan","sinan.engin@gmail.com.tr", "ADMIN"));
		users.add(new User("ahmet","ahmet.cakar@gmail.com.tr", "USER"));
		users.add(new User("ertem","ertem.sener@gmail.com.tr", "ADMIN"));
		users.add(new User("abdülkerim","abd.durmaz@gmail.com.tr", "ADMIN"));
		users.add(new User("rasim ozan","rok@gmail.com.tr", "USER"));
		model.addAttribute("users", users);
		return "if-unless";
	}
	
	@GetMapping("/switch-case")
	public String switchCase(Model model) {
		User user = new User("sinan","sinan.engin@gmail.com.tr", "ADMIN");
		model.addAttribute("user", user);
		return "switch-case";
	}
	

}
