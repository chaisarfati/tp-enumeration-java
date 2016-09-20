package com.teachersdunet.javaintermediaire;

public class Horoscope {
    public enum Day{
         MONDAY, 
         TUESDAY, 
         WEDNESDAY, 
         THURSDAY, 
         FRIDAY, 
         SATURDAY, 
         SUNDAY;
    
    Day(){
        
    }
    
}
    private Day day;

    public void setDay(Day day) {
        this.day = day;
    }



    public void getInfo() {
        switch (day) {
            case MONDAY:
                System.out.println("Great day!");
                break;
            case TUESDAY:
            case WEDNESDAY:
                System.out.println("Your day will be fun!");
                break;
            case THRUSDAY:
                System.out.println("You will find a new girlfriend.");
                break;
            case SATURDAY:
                System.out.println("Nothing to say!");
                break;
            case FRIDAY:
            case SUNDAY:
                System.out.println("You will be very lucky!");
                break;
        }
    }

    public static void main(String[] args) {
        Horoscope h = new Horoscope();
        h.setDay(Day.MONDAY);
        h.getInfo();
        /*  Erreur de compilation
         *      h.setDay("djkddk"); 
         *      h.getInfo();
        */
        h.setDay(Day.SATURDAY);
        h.getInfo();
    }
}
