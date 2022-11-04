package com.company;
public class Candy extends DessertItem{
   int totalcandies = 600;
   int price = 60;
   int tax = 100;
   int totalprice ;
   int number = 20;
   @Override
   public void addItem(int number){
       totalcandies =totalcandies + number;
       System.out.println("total Candies in the store ="+totalcandies);
   }
   @Override
   public void getCost(int number){
       price=number*price;
       totalprice=price+tax*number;
       System.out.println("the cost of "+number+"candies is "+number+"*"+price+"="+price);
       System.out.println("tax is :"+(tax*number)+"\ntotal cosr ="+totalprice);

   }
}
