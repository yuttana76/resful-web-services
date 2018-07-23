package com.example.rest.webservices.resfulwebservices.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

//	@RequestMapping(method= RequestMethod.GET, path="/hello-world") 	//Original style
	@GetMapping(path="/hello-world")	//Another style (Short & easy)
	public String helloWorld(){
		return "Hello World.";
	}
	
	@GetMapping(path="/hello-world-bean")	//Another style (Short & easy)
	public HelloWorldBean helloWorldBean(){
		return new HelloWorldBean("Hello World.");
	}
	
	@GetMapping(path="/hello-world/path-variable/{name}")	//Another style (Short & easy)
	public HelloWorldBean helloWorldPathVariable(@PathVariable String name){
		return new HelloWorldBean( String.format("Hello World. %s", name) );
	}
	
}
