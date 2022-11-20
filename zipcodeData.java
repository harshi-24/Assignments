package com.rest.webservices.restfulwebservices.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;
@Component
public class zipcodeData {
  private static List<Zipcode> zipcodes = new ArrayList<>();
  
  static
  {
	   zipcodes.add(new Zipcode(506368,"Nellikudur","Telangana","India"));
	   zipcodes.add(new Zipcode(506363,"Thorrur","Telangana","India"));
	   zipcodes.add(new Zipcode(505234,"Vizag","AndhraPradesh","India"));
	   zipcodes.add(new Zipcode(560235,"Bangalore","Karnataka","India"));
	   zipcodes.add(new Zipcode(456789,"Paris","London","UK"));
	   zipcodes.add(new Zipcode(526894,"AK","Anchorage","US"));
  
  }
  public List<Zipcode> findAll()
  {
      return zipcodes;
  }
  public Zipcode findOne(int hashcode)
  {
      Predicate<? super Zipcode> predicate= codes->codes.getZipcode().equals(hashcode);
      return zipcodes.stream().filter(predicate).findFirst().orElse(null);
  }
}

