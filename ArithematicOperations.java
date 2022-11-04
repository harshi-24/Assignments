package com.company;
public class ArithematicOperations {
    public static void main(String[] args){
      Additionlambda lambdaadd = ( num1, num2) -> (num1 + num2);
      System.out.println(lambdaadd.getresult(5,6));
      Additionlambda lambdasubtract = ( num1, num2) -> (num1 - num2);
      System.out.println( lambdasubtract.getresult(7,9));
      Additionlambda lambdamultiple = ( num1, num2) -> (num1 * num2);
      System.out.println( lambdamultiple.getresult(5,4));
      Additionlambda lambdiadivision = ( num1, num2) -> (num1 /num2);
      System.out.println( lambdiadivision.getresult(9,2));
    }
    interface Additionlambda {
        int getresult(int num1, int num2);
    }
}
