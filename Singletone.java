package com.company;

 class Singletone {
  private static Singletone single_instance =null;
  public String name;
  private Singletone()

  {
   name = "Singletone";
  }
  public static Singletone getInstance()
  {
   if(single_instance==null)
    single_instance = new Singletone();
   return single_instance;
  }
}
class Single{
  public static void main(String args[]){
   Singletone get = Singletone.getInstance();
   Singletone set = Singletone.getInstance();
   System.out.println("Hashcode of get is " + get.hashCode());
   System.out.println("Hashcode of set is " + set.hashCode());
   if(get==set){
    System.out.println("Two objects located at same location");
   }
   else{
    System.out.println("Two objects located at different location");
   }
  }
}
