package com.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Number of inputs: ");
        int n = Integer.parseInt(br.readLine());
        Employee[] employees1 = new Employee[n];
        int i = 0;
        while (i < n){
            System.out.println("Enter " + (i + 1) + " th Record: ");
            String s = br.readLine();
            employees1[i] = new Employee(s);
            ++i;
        }
        showEmployeeDetails(employees1);
        System.out.println("Number of Objects Created: " + Employee.getNumberOfObjectsCreated());
    }
    static void showEmployeeDetails(Employee[] employees){
        for(Employee employee: employees) System.out.println(employee.toString());
    }
}
