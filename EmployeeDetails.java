package com.rest.webservices.restfulwebservices.demo;

public class EmployeeDetails {
    private Integer empId;
    private String empName;
    private String empDesignation;
    private String empDepartment;
    private long empSal;
    public EmployeeDetails(Integer empId, String empName, String empDesignation, String empDepartment, long empSal) {
        super();
        this.empId = empId;
        this.empName = empName;
        this.empDesignation = empDesignation;
        this.empDepartment = empDepartment;
        this.empSal = empSal;
    }
    public Integer getEmpId() {
        return empId;
    }
    public void setEmpId(Integer empId) {
        this.empId = empId;
    }
    public String getEmpName() {
        return empName;
    }
    public void setEmpName(String empName) {
        this.empName = empName;
    }
    public String getEmpDesignation() {
        return empDesignation;
    }
    public void setEmpDesignation(String empDesignation) {
        this.empDesignation = empDesignation;
    }
    public String getEmpDepartment() {
        return empDepartment;
    }
    public void setEmpDepartment(String empDepartment) {
        this.empDepartment = empDepartment;
    }
    public long getEmpSal() {
        return empSal;
    }
    public void setEmpSal(long empSal) {
        this.empSal = empSal;
    }
    @Override
    public String toString() {
        return "EmployeeDetails [empId=" + empId + ", empName=" + empName + ", empDesignation=" + empDesignation
                + ", empDepartment=" + empDepartment + ", empSal=" + empSal + "]";
    }
}
