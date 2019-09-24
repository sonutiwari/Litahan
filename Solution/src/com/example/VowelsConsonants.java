package com.example;

public class VowelsConsonants {
    public boolean isVowel(char c){
        String vowels = "AEIOUaeiou";
        return vowels.indexOf(c) != -1;
    }
}
