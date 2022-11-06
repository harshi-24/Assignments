package com.company;

public class Stringbuffer1 {

    public static void main(String args[])
    {
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());
        sb.append("Is a peer class of String");
        System.out.println(sb.capacity());
        sb.append("that provides much of");
        System.out.println(sb.capacity());
        sb.append("the functionality of strings");
        System.out.println(sb.capacity());
    }
}
