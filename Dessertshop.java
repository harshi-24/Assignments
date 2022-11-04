package com.company;


import java.util.*;
public class Dessertshop {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Cookie cookie = new Cookie();
        Candy candy = new Candy();
        Icecream icecream = new Icecream();
        System.out.println("Choose 1 if u are owner \nChoose 2 if u are customer ");
        int choose = s.nextInt();
        switch (choose) {
            case 1:
                System.out.println("Enter the item you want to add");
                String str = s.next();
                if (str.equalsIgnoreCase("Cookie")) {
                    System.out.println("Enter the number of cookie you want to add");
                    int number = s.nextInt();
                    cookie.addItem(number);
                } else if (str.equalsIgnoreCase("Candy")) {
                    System.out.println("Enter the number of candy you want to add");
                    int number = s.nextInt();
                    candy.addItem(number);
                } else if (str.equalsIgnoreCase("Icecream")) {
                    System.out.println("Enter the number of icecream you want to add");
                    int number = s.nextInt();
                    icecream.addItem(number);
                }
                break;
            case 2:
                System.out.println("Enter item you want to order");
                String Str = s.next();
                if (Str.equalsIgnoreCase("Cookie")) {
                    System.out.println("Enter the number of cookie you want");
                    int number = s.nextInt();
                    cookie.getCost(number);
                } else if (Str.equalsIgnoreCase("Candy")) {
                    System.out.println("Enter the number of candy you want");
                    int number = s.nextInt();
                    candy.getCost(number);
                } else if (Str.equalsIgnoreCase("Icecream")) {
                    System.out.println("Enter the number of icecream you want");
                    int number = s.nextInt();
                    icecream.getCost(number);
                }

        }
    }
}