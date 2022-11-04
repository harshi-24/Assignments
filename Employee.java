package com.company;

 class  Employee {
    int employeeid;
    String employeename;
    double salary;
    public Employee(int employeeid, String employeename, double salary){
        this.employeeid = employeeid;
        this.employeename = employeename;
        this.salary = salary;
    }
    public int getEmployeeid(){
        return employeeid;
    }
    public void setEmployeeid(int employeeid) {
        this.employeeid = employeeid;
    }
    public String getEmployeename(){
     return employeename;
    }
    public void setEmployeename(String employeename) {
        this.employeename = employeename;
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

}
