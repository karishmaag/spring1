package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController2 {
	@Value("${var1}")
	private String color;
	@GetMapping("/col")
	public String getMyFav()
	{
		return "My Favourite Color is "+color;
	}

}
