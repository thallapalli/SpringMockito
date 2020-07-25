package com.kt.springmockito;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	@GetMapping(value = "/hello-world")
	public String helloworld() {
		return "Hello World";
		
	}
}
