package com.company;

public class Strbuilder2 {

    public static void main(String[] args) {
        String str = "It is used to ";
        StringBuilder s= new StringBuilder(str);
        System.out.println(str);
        s.insert(13,"insert text");
        System.out.println(s);
        System.out.println(s.toString());
    }
}
