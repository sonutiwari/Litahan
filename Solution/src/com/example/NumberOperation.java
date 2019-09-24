package com.example;

public class NumberOperation {
    public static boolean isArmstrong(int number){
        int sum = 0;
        int temp = number;
        while(temp > 0){
            int digit = temp % 10;
            sum += digit * digit * digit;
            temp /= 10;
        }
        return sum == number;
    }

    public static boolean isPrime(int number){
        int temp = (int)(Math.sqrt(number));
        for(int i = 2; i <= temp; i++){
            if((number % i) == 0) return false;
        }
        return true;
    }
}
