package com.company;

class account
{
    int balance = 5000;

    public int balance()
    {
        return balance;
    }

    public int withdraw(int amount)
    {
        if ( amount>balance)
        {
            throw new NotSufficientFundException(String.format("current balance less than requried" + balance +amount));
        }
        balance = balance - amount;
        return balance;
    }

    public void deposit(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException(String.format("invalid deposit amount: %f", amount));
        }
    }
    class NotSufficientFundException extends RuntimeException

        {
            String message;
            public NotSufficientFundException(String message)
            {
                this.message = message;
            }
            public String getMessage()
            {
                return message;
            }

        }
    }

public class SavingAccount {
    public static void main(String[] args) {
        account a = new account();
        System.out.println("current balance: " +a.balance());
        System.out.println("withdraw amount: 500");
        a.withdraw(500);
        System.out.println("remaining balance: " +a.balance());
        a.withdraw(1000);
        a.deposit(-400);
    }
}
