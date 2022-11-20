package com.rest.webservices.restfulwebservices.demo;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ZipcodeController {
	private zipcodeData service;
	public ZipcodeController(zipcodeData service)
	  {
	      this.service=service;
	  }
	  @GetMapping("/locations")
	  public List<Zipcode> retrievelocations()
	  {
	      return service.findAll();
	  }
	  @GetMapping("/location/{zipcode}")
	  public Zipcode retriveOfSpecific(@PathVariable int zipcode)
	  {
	      return service.findOne(zipcode);
	  }


}
