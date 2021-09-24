package com.example.SpringRestProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/hello")
public class HelloRestController {

	@RequestMapping(value= {"","/","/hello"})
	public String hello() {
		return "Hello from Bridgelabz";
		
	}
}
