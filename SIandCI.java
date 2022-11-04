package com.company;

public class SIandCI {
    public static void main(String[] args){
        double principle =10000,rate =5,time =4;
     double SI =(principle*time*rate)/100;
     System.out.println("simple interest ="+SI);
     double CI = principle*(Math.pow((1+rate/100),time));
     System.out.println("compound interest ="+CI);
    }
}
