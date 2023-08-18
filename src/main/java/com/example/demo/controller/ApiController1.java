package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController1 {
	@Value("${var}")
	public String studentName;
	@GetMapping("/")
	private String getName()
	{
		return "Welcome " +studentName+ " !";
	}

}
