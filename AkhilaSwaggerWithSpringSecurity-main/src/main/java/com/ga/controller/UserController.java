package com.ga.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ga.model.User;
import com.ga.repository.UserRepository;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;

@RestController
@SecurityRequirement(name = "greenapex")
public class UserController {
	
	@Autowired
	UserRepository userRepository;
	

	@GetMapping(value = "/welcome")
	public String welcome() {
		return "hello";

	}

	@GetMapping(value = "/greenapex")
	public String testSecurity() {
		return "Hello GreenApex";

	}
	@PostMapping("/save")
	public User save(@RequestBody User user) {
		return userRepository.save(user);
	}
	@GetMapping("/getById/{id}")
	public Object getById(@PathVariable Long id) {
		return userRepository.findById(id);
	
	}
	@GetMapping("/getAll")
	public List<User> getAll() {
		return userRepository.findAll();
}
}