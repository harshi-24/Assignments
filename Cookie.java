package com.company;

public class Cookie extends DessertItem{
    int totalCookies=500;
    int price=70;
    int tax=70;
    int totalprice;
    int number=10;
    @Override
    public void addItem(int number){
        totalCookies=totalCookies+number;
        System.out.println("total Cookies in the store="+totalCookies);
    }
    @Override
    public void getCost(int number) {
        price=number*price;
        totalprice=price+tax*number;
        System.out.println("Total cost of "+number+"cookies is "+number+"*"+price+"="+price);
        System.out.println("Tax is :"+(tax*number)+"\ntotal cost="+totalprice);

    }
}
