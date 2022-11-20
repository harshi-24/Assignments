package com.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SimpleInterest {
	@RequestMapping(value="interest", method =RequestMethod.GET)
 public String sayHello2() {
		return "interest";
		
	}
@RequestMapping(value ="/interest",method = RequestMethod.POST)	
public String simple(ModelMap model, @RequestParam int Amount,@RequestParam int Rate,@RequestParam int Time) {
	
	double SI = (Amount*Rate*Time)/100;
	model.addAttribute("simpleinterest",SI);
	return "simpleinterest";
}
	
	
}
