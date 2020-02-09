package week1;
/*
Create a program that counts how many seconds there are in a year.
You can assume that a year consists of 365 days (therefore the year is not a leap year).
There are X seconds in a year.
X should be replaced with the calculation of your program.
 */

public class Exercise5 {
    public static void main(String[] args) {
        int daysInAYear = 365; //zile;
        int hoursInADay = 24; //ore;
        int minutesInAnHour = 60; //min;
        int secondsInAMinute = 60; //secunde;

        int secondsInAYear = daysInAYear*hoursInADay*minutesInAnHour*secondsInAMinute;

        System.out.printf("There are %s",secondsInAYear + " seconds in a year.");

    }
}
