package com.example.EncryptText;

import java.util.Locale;

public class Encrypt {
    public static void main(String[] args) {
        System.out.println(normalizeText("This is some \"really\" great. (Text)!?"));
    }
    private static  String normalizeText(String text){
        String match = "[.,:;'\"!?() ]";
        text = text.replaceAll(match, "");
        text = obify(text.toUpperCase(Locale.ENGLISH));
        return text;
    }

    private static String obify(String text) {
        String[] array = text.split("");
        for (int i = 0; i < array.length; i++) {
            if (array[i].matches("[AEIOU]")) array[i] = "OB" + array[i];
        }
        return String.join("", array);
    }
}
