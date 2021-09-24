package com.example.SpringRestProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.SpringRestProject.model.User;


@Controller
@RequestMapping("/hello")
public class HelloRestController {

	@RequestMapping(value= {"","/","/hello"})
	public String hello() {
		return "Hello from Bridgelabz";
		
	}
	
	@RequestMapping(value= {"/query"},method=RequestMethod.GET)
	public String SayHello(@RequestParam(value="fName") String fName,@RequestParam(value="lName")String lName) {
		return "Hello"+fName+" "+lName+"";
	
	}
	@GetMapping("/param/{name}")
	public String helloPathVarible(@PathVariable String name) {
		return name;
		
	}
	@PostMapping("/post")
	public String helloPost(@RequestBody User user) {
		return user.getFirstName()+" "+user.getLastName();
	}
	@PutMapping("/put/{firstName}")
	public String sayHello(@PathVariable String firstName,@RequestParam(value="lastName") String lastName) {
		return firstName+" "+lastName;
		
	}
}
