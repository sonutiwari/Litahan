package com.example;

public class HourToMinuteSeconds {
    public void hourToMinuteSeconds(int hour){
        long minutes = hour * 60;
        long seconds = minutes * 60;
        System.out.println("Minutes in " + hour + " Hours " + minutes);
        System.out.println("Minutes in " + hour + " seconds " + seconds);
    }
}
