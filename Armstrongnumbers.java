package com.company;

public class   Armstrongnumbers
{
    public static void main(String[] args)
    {
        System.out.println("armstrong numbers between 100 to 999");
        int num1,num2,num3,result,temp;
        for(int num =100;num<=999;num++){
            temp =num;
            num3 =temp%10;
            temp = temp/10;

            num2 =temp%10;
            temp = temp/10;

            num1 =temp%10;
            result =(num1*num1*num1)+(num2*num2*num2)+(num3*num3*num3);
            if(num==result)
            {
                System.out.println(num);
            }
        }
    }
}
