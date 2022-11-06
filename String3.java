package com.company;

public class String3 {

    public static void main(String[] args) {
        String a="this is a string programm in the core java ";
        System.out.println(a.toLowerCase());
        System.out.println(a.toUpperCase());
        System.out.println(a.replace('i','$'));
        String b="This Is a String Programm In The Core Java";
        System.out.println(a.equals(b));
        System.out.println(a.equalsIgnoreCase(b));
    }
}
