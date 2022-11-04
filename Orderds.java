package com.company;



public class Orderds {
    public static void main(String[] args) {
        Amount lambdaprice = (int price) -> {
            if (price >=10000 ) {
              System.out.println("order placed");
            }
            else {
                System.out.println("order not placed");
            }
        };
      lambdaprice.price(15000);
    }
    interface Amount {
        void price(int price);


        }

}
