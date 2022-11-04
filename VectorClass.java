package com.company;
 import java.util.Vector;
public class VectorClass
{
    public static void main(String args[])
    {
        Vector<Integer> intVector = new Vector<>();
        intVector.add(1);
        intVector.add(2);
        intVector.add(3);
        intVector.add(4);
        intVector.add(5);
        intVector.add(6);
        intVector.add(7);
        intVector.add(8);
        intVector.add(9);
        intVector.add(10);

        System.out.println(intVector.capacity());
        intVector.add(11);
        System.out.println(intVector.capacity());
    }
}
