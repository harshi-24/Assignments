package com.company;

public class Icecream extends DessertItem {
    int totalicecreams = 500;
    int price = 40;
    int tax = 60;
    int totalprice ;
    @Override
    public void addItem(int number){
        totalicecreams =totalicecreams+ number;
        System.out.println("totalicecreams in the store ="+totalicecreams);
    }
    @Override
    public void getCost(int number){
        number=10;
        price =number*price;
        totalprice =price+tax*number;
        System.out.println("the cost of"+number"icecreams is price+"="+price");
        System.out.println("tax is:"+(tax*price)+"\n totalprice ="+totalprice);
    }
}
