package com.company;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first number");
        int num1 = scanner.nextInt();
        System.out.println("enter second number");
        int num2 = scanner.nextInt();
        try {
            int result= num1/num2;
            System.out.println("result: " + result);
          }
        catch(ArithmeticException e){
          System.out.println("Division by zero");
          e.printStackTrace();
        }
    }
}
