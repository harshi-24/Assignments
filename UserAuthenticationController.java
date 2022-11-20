package com.rest.webservices.restfulwebservices.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserAuthenticationController {
	private UserAuthentication result;
	public UserAuthenticationController(UserAuthentication result)
	{
	this.result =result;	
	}
	@GetMapping("/welcome/{username}/{password}")
	public String solution(@PathVariable String username,@PathVariable String password )
	{
		boolean solution =result.find(username,password);
		if(solution)
		{
		 return "valid user";	
		}
		else
		{
	    return "not valid";		
		}
	}
}