package com.example.companystructure;

public class TechnicalEmployee extends Employee {
    private static final double BASE_SALARY = 75000;
    TechnicalEmployee(String name) {
        super(name, BASE_SALARY);
    }

    @Override
    public String employeeStatus(){
        return this.toString() +
                " has 10 Successful Check ins";
    }
}
