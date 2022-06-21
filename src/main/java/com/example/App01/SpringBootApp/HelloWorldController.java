package com.example.App01.SpringBootApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class HelloWorldController {
	
	@GetMapping("/get")
	public String sayHello() {
		return "Hello Spring Boot Application";
	}
	
	@GetMapping("/hi")
	public String SayHi() {
		return "Hi Spring Boot Application";
	}

}
