package com.teachersdunet.javaintermediaire;

public class Horoscope {

    private String day;

    public void setDay(String day) {
        this.day = day;
    }

    public void getInfo() {
        switch (day) {
            case "Monday":
                System.out.println("Great day!");
                break;
            case "Tuesday":
            case "Wednesday":
                System.out.println("Your day will be fun!");
                break;
            case "Thursday":
                System.out.println("You will find a new girlfriend.");
                break;
            case "Saturday":
                System.out.println("Nothing to say!");
                break;
            case "Friday":
            case "Sunday":
                System.out.println("You will be very lucky!");
                break;
        }
    }

    public static void main(String[] args) {
        Horoscope h = new Horoscope();
        h.setDay("Monday");
        h.getInfo();
        h.setDay("djkddk");
        h.getInfo();
        h.setDay("Saturday");
        h.getInfo();
    }
}
