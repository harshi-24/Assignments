package com.company;

public class TypeInferenceiexample {
    public static void main(String[] args) {
        Stringlengthlambda myLambda = (String s) -> s.length();
        System.out.println(myLambda.getLength("Hello, world!"));
    }
    interface Stringlengthlambda{
        int getLength(String s);
    }

}
