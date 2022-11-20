package com.rest.webservices.restfulwebservices.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

@Component
public class EmployeeDataStore {
	 private static List<EmployeeDetails> emp=new ArrayList<>();
	    private static int empcount=0;
   static
   {
	   emp.add(new EmployeeDetails(++empcount,"Harshitha","Bsc","Maths",20000));
       emp.add(new EmployeeDetails(++empcount,"Gouthami","Msc","Chemistrh",25000));
       emp.add(new EmployeeDetails(++empcount,"Parvathi","MCA","Computer",30000));
   }
   public List<EmployeeDetails> findAll()
   {
       return emp;
   }
   public EmployeeDetails findOneEmp(int id)
   {
       Predicate<? super EmployeeDetails> predicate=emps->emps.getEmpId().equals(id);
       return emp.stream().filter(predicate).findFirst().orElse(null);
   }
   public EmployeeDetails save(EmployeeDetails user)
   {
       user.setEmpId(++empcount);
       emp.add(user);
       return user;
   }
   public void deleteOneEmp(int id)
   {
       Predicate<? super EmployeeDetails> predicate=emps->emps.getEmpId().equals(id);
       //return emp.stream().filter(predicate).findFirst().orElse(null);
       emp.removeIf(predicate);
   }

   }
 