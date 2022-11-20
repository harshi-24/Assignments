package com.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloWorldController {
	@RequestMapping(value="/helloworld",method = RequestMethod.GET)
	public String printHello() {
		return "helloworld";
	}		

@RequestMapping(value="/index", method = RequestMethod.GET)
public String sayHello() {
return "index";	
}

@RequestMapping(value="/index",method = RequestMethod.POST)
public String sayHello1() {
	return "index";
}
}