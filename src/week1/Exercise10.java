package week1;
/*
The circumference of a circle is calculated using the formula 2 * pi * radius.
Create a program that asks the user for the radius and then calculates the circumference using the given radius.
Java already contains the value of pi in the Math.PI variable, which you can use in your calculation.
Type the radius: 20
Circumference of the circle: 125.66370614359172
 */

import java.util.Scanner;

import static java.lang.String.valueOf;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Type the radius: ");
        int radius = Integer.parseInt((read.nextLine()));
        double circumferenceCircle = 2*Math.PI*radius;
        System.out.println("Circumference of the circle: "+ circumferenceCircle);
    }
}
