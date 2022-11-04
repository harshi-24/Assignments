package com.company;

public class Armstrong {
    public static void main(String[] args){
        int num = 153,originalnumber,remainder,result=0;
        originalnumber =num;
        while(originalnumber!=0)
        {
            remainder =originalnumber % 10;
            result +=Math.pow(remainder,3);
            originalnumber /= 10;
        }
        if(result== num)
            System.out.println(num+"is an Armstrong Number");
        else
            System.out.println(num+"is not an Armstrong Number");
    }

}
