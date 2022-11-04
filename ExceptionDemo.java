package com.company;

public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            int num1 =0;
            int num2 =4/num1;
            System.out.println("Number  of exceptions");

        }
        catch (Exception e) {
            System.out.println("division by zero");
            e.printStackTrace();
        }
        System.out.println("after catch block");
    }
}
