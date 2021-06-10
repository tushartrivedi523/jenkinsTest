package com.nagarro.JenkinsTest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestTemp {
	
	@GetMapping("/home")
	public String getHome()
	{
		return " Hi User";
	}

}
