package com.lohith.training.web;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	
	
	List<Greeting> allGreetings;
	
	@PostConstruct
	public void init() {
		allGreetings = new ArrayList<>();
		Greeting g1 = new Greeting("morning","Good Morning");
		Greeting g2  = new Greeting("Evening","Good Evening");
		
		allGreetings.add(g1);
		allGreetings.add(g2);
	}
	
	@GetMapping("/greeting")
	public List<Greeting> getAllGreetings(){
		return allGreetings;
	}

}
