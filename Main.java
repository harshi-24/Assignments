package com.company;

public class Main {
    public static void main(String[] args){
        Manager m1 = new Manager(1,"M.Nemo",40000);
        Manager m2 = new Manager(2,"M.John",50000);
        Labour l1 = new Labour(01,"L.Das",20000);
        Labour l2 = new Labour(02,"L.Pal",25000);
        System.out.println(m1.getsalary()+m2.getsalary()+l1.getsalary()+l2.getsalary());
    }
}
