package com.example.companystructure;

public class Employee {
    private static final String CONFIRMED_STATUS = "CONFIRMED";
    private static final String UNCONFIRMED_STATUS = "UNCONFIRMED";
    private static int empCount = 0;
    protected boolean approveCheckIns;
    private String name;
    private double baseSalary;
    private int employeeId;
    private Employee manager;
    private String  status = UNCONFIRMED_STATUS;

    Employee(String name, double baseSalary){
        this.name = name;
        this.baseSalary = baseSalary;
        this.employeeId = ++empCount;
    }

    String getName() {
        return name;
    }

    void setBaseSalary(double baseSalary) { this.baseSalary = baseSalary; }
    double getBaseSalary() {
        return baseSalary;
    }

    private int getEmployeeId() {
        return employeeId;
    }

    Employee getManager() {
        return manager;
    }
    void setManager(Employee manager) {
        this.manager = manager;
    }

    String getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        if(status)this.status = CONFIRMED_STATUS;
        this.status = UNCONFIRMED_STATUS;
    }

    boolean equals(Employee others){
        return this.employeeId == others.getEmployeeId();
    }

    public String employeeStatus(){
        return this.status;
    }

    @Override
    public String toString() {
        return this.getEmployeeId() + " " + this.getName();
    }
}
