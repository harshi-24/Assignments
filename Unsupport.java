package com.company;

public class Unsupport {
    public static void main(String[] args) {
        try {
            int num1 = 5;
            int num2 = 0;
            int result = num1 / num2;
            System.out.println("result : " + result);
        } catch (ArithmeticException e) {
            System.out.println("Unsupported operation exception ");
        }
    }

}
