package com.company;

        import java.util.*;
public class Array {
    public static void main(String[] args)
    {
        int a[] = {5, 12, 14, 6, 78, 19, 1, 23, 26, 35, 37, 7, 52, 86, 47};
        Scanner s = new Scanner(System.in);
        System.out.println("enter searching value");
        int key = s.nextInt();
        for (int i = 0; i < 15; i++)
        {
            if(key==a[i])
            {

                System.out.println(key + "is found at index" + i);
            }
        }
    }
}



