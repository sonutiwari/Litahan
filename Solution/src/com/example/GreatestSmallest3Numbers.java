package com.example;

public class GreatestSmallest3Numbers {
    int greatest(int a, int b, int c){
        return Math.max(Math.max(a, b), c);
    }

    int smallest(int a, int b, int c){
        return Math.min(Math.min(a, b), c);
    }
}
