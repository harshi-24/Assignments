package com.company;

public class Person {
   private String firstname;
   private String lastname;
   private int age;

   public Person(String firstname, String lastname, int age) {
       super();
       this.firstname = firstname;
       this.lastname = lastname;
       this.age = age;
   }
   public String  getFirstName() {
       return firstname;
   }
   public void setFirstname(String firstname) {
       this.firstname = firstname;
   }
   public String getLastname() {
    return lastname;
   }
   public void setLastname(String lastname) {
       this.lastname = lastname;
   }
   public int getAge() {
       return age;
   }
   public void setAge(int age) {
       this.age = age;
   }
   @Override
  public String toString() {
     return "Person [firstname=" + firstname + ", lastname="  + lastname + ", age=" + age+"]";
   }
}
