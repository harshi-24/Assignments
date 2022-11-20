package com.rest.webservices.restfulwebservices.demo;

import org.springframework.stereotype.Component;
@Component
public class CalculatorResource {
 
	private Double value1 ;
	private Integer value2 ;
		
	 public int add(int num1, int num2) 
	 {
		 return num1+num2;
	 }
	 public int sub(int num1, int num2) 
	 {
		 return num1-num2;
	 }
	 public int multiply(int num1, int num2) 
	 {
		 return num1*num2;	 }
	 public int div(int num1,int num2) 
	 {
		 return num1/num2;	 }
	 	public double sqrt(double value1) {
		// TODO Auto-generated method stub
		return (Math.sqrt(value1));
	}

}

