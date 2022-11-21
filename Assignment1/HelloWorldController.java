package com.Assignment1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@	RestController
public class HelloWorldController {

	@GetMapping(path="/hello-world")
	public String helloWorld() {
		return "Hello World";
	}
	@GetMapping(path="/hello-world-bean")
	public HelloworldBean helloWorldBean() {
		return new HelloworldBean("Hello World");
	}
	@GetMapping(path="/hello-world/path-variable/{name}")
	public HelloworldBean helloWorldBeanPathVariable(@PathVariable String name) {
		return new HelloworldBean(String.format("Hello World,%s", name));
	}
	
	}  


