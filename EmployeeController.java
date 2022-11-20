package com.rest.webservices.restfulwebservices.demo;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
  private EmployeeDataStore service;
  public EmployeeController(EmployeeDataStore service)
  {
      this.service=service;
  }
  @GetMapping("/employees")
  public List<EmployeeDetails> retrieveEmployees()
  {
      return service.findAll();
  }
  @GetMapping("/employee/{id}")
  public EmployeeDetails retriveOfSpecific(@PathVariable int id)
  {
      return service.findOneEmp(id);
  }
  @DeleteMapping("/employee/{id}")
  public void deleteOfSpecific(@PathVariable int id)
  {
       service.deleteOneEmp(id);
  }
  @PostMapping("/employee")
  public EmployeeDetails createUser(@RequestBody EmployeeDetails user)
    {
        return service.save(user);
    }

}