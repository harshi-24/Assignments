package com.company;


import java.util.Scanner;

    public class Incometax {
        public static void main(String[] args)
        {
            double tax,income;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter income ");
            income=sc.nextDouble();
            if(income<=180000)
            tax=0;
            else if(income<=300000)
                tax=0.1*(income-181000);
            else if(income<=500000)
                tax=(0.2*(income-300000))+(0.1*100000);
            else if(income<=1000000)
                tax=(0.3*(income-500000))+(0.2*200000)+(0.1*180000);
            else
                tax=(0.4*(income -1000000))+(0.3*500000)+(0.2*200000)+(0.1*100000);
            System.out.println("Income tax amount is "+tax);
        }
    }



