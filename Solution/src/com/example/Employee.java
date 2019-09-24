package com.example;

public class Employee {
    private static int currentNumber = 0;
    private int empNo;
    private String empName;
    private float empSalary;
    private boolean isConfirmed;

    Employee(String params){
        String[] parameters = params.split(" ");
        this.empNo = generateEmployeeNumber();
        this.empName = parameters[0];
        this.empSalary = Float.parseFloat(parameters[1]);
        this.isConfirmed = Boolean.getBoolean(parameters[2]);
    }

    @Override
    public String toString() {
        return "Employee Number: " + this.empNo +
                "\nEmployee Name: " + this.empName +
                "\nEmployee Salary: " + this.empSalary +
                "\nEmployee confirmed status: " + this.isConfirmed;
    }
    public int getEmpNo() {
        return empNo;
    }

    public String getEmpName() {
        return empName;
    }

    public float getEmpSalary() {
        return empSalary;
    }

    public boolean isConfirmed() {
        return isConfirmed;
    }

    public void setConfirmed(boolean confirmed) {
        isConfirmed = confirmed;
    }
    public String employeeStatus(){
        return null;
    }
    static int generateEmployeeNumber(){
        return ++Employee.currentNumber;
    }
    static int getNumberOfObjectsCreated(){
        return Employee.currentNumber;
    }
}
