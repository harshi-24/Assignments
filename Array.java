package com.company;
        import java.util.Scanner;

public class Array {
    public static void main(String args[]) {
        int a, key, n, flag = 0;

        Scanner s = new Scanner(System.in);
        System.out.println("enter the size of an array");
        n = s.nextInt();
        int arr[] = new int[n];
        System.out.println("enter elements into an array");

        for(a = 0; a < n; a++)
        {
            arr[a] = s.nextInt();


        }

        System.out.println("enter element to search");
        key = s.nextInt();
        for (a = 0; a < n; a++) {
            if (arr[a] == key) {
                flag = 1;

                break;
            }
        }
        if (flag == 1) {
            System.out.println("key found" + key);

        }

    }
}



