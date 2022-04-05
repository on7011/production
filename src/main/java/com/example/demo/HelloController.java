package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class HelloController {
	
	
	@RequestMapping(value="/hello/{param}")
	private String helloPathVariable(@PathVariable("param")String name) {
		
		return "Hello!" + name;
	}
	
}