package com.company;

public class Manager extends Employee {
    public static final double incentive =1;
    public Manager(int employeeid,String employeename,double salary) {
        super(employeeid,employeename,salary);
    }
    public double getsalary() {
        return salary+salary*incentive;
    }
}

