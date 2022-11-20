package com.rest.webservices.restfulwebservices.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;
@RestController
public class CalculatorController {

  private CalculatorResource calc;
 public CalculatorController(CalculatorResource calc) {
		this.calc =calc;
	}


 @GetMapping("/add/{value1}/{value2}")
 public int add(@PathVariable int value1 ,@PathVariable int value2) {
 return calc.add (value1,value2);
 }
 @GetMapping("/sub/{value1}/{value2}")
 public int sub(@PathVariable int value1 ,@PathVariable int value2) {
 return calc.sub(value1, value2);
 }
 @GetMapping("/multiply/{value1}/{value2}")
 public int multiply(@PathVariable int value1 ,@PathVariable int value2) {
 return calc.multiply(value1, value2);
 }
 @GetMapping("/div/{value1}/{value2}")
 public int div(@PathVariable int value1 ,@PathVariable int value2) {
 return calc.div(value1, value2);
 }
 @GetMapping("/sqrt/{value1}")
 public double sqrt(@PathVariable double value1) {
 return calc.sqrt(value1);
 }
}
