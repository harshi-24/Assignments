package com.rest.webservices.restfulwebservices.demo;

import java.util.List;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
	private CustomerData service;
	  public CustomerController(CustomerData service)
	  {
	      this.service=service;
	  }
	  
	  @DeleteMapping("/customer/{id}")
	  public void deleteById(@PathVariable int id)
	  {
	       service.deleteOnecus(id);
	  }
	  @PostMapping("/customer")
	  public Customer createcustomer(@RequestBody Customer customer)
	    {
	        return service.save(customer);
	       
	    }
	  @GetMapping("/customer")
	  public List<Customer> retrievecustomers()
	  {
		return service.findAll() ; 
	  }
	  @GetMapping("/customer/{id}")
	  public Customer retriveOfSpecific(@PathVariable int id)
	  {
	      return service.findOnecus(id);
	  }

    }
