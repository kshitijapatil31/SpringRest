package com.example.SpringRestProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


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
}
