package com.learnspringboot3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@GetMapping("/hello")
	public String greet() {
		return "Hello from Spring Boot 3!";
	}
}
