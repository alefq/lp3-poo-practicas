package com.example.restservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		//return new Greeting(counter.incrementAndGet(), String.format(template, name));
		return new FormalGreeting(counter.incrementAndGet(), String.format(template, name));
	}
	
	@GetMapping("/greeting2")
	public Greeting greeting(@RequestParam(value = "name") String name, 
			@RequestParam(value = "lastName") String lastName, @RequestParam(value = "age") int age) {
		Greeting greeting = new Greeting(name, lastName, age, counter.incrementAndGet());
		System.out.println(greeting);
		return greeting;
	}
	
	public void printlnt(Object object) {
		object.toString();
	}
	
	@GetMapping("/videos")
	public Video videos() {
		return new Pelicula();
	}
	
	@GetMapping("/series")
	public Video series() {
		return new Serie();
	}
}
