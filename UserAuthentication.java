package com.rest.webservices.restfulwebservices.demo;

import org.springframework.stereotype.Component;

@Component
public class UserAuthentication {
  private String username="Harshitha";
  private String password="Chitti#02";
  public boolean find(String username1,String password1)
  {
     /* if((username==username1)&&(password==password1))
      {
          return true;
      }
      else
      {
          return false;
      }
}*/
	  return username.equals(username1)&&password.equals(password1);
  }
}