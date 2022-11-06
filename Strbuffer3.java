package com.company;

public class Strbuffer3 {

    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("This method returns the reversed object on which it was called");
        System.out.println("Before reverse :"+sb);
        sb.reverse();
        System.out.println("After reverse :"+sb);
    }
}
