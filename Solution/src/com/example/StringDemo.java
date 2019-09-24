package com.example;

import java.util.Scanner;

public class StringDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print Names separated by comma: ");
        String input = scanner.nextLine();
        String[] names = input.split(",");
        for (String name: names
             ) {
            name = name.trim(); // Remove extra spaces while typing.
            System.out.println("Length of String: " + name.length());
            System.out.println("String: " + name);
        }
    }

}
