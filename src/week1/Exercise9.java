package week1;
/*
Create a program that asks the user for two integers and prints their quotient.
Make sure that 3 / 2 = 1.5.
Type a number: 3
Type another number: 2
Division: 3 / 2 = 1.5
 */

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        System.out.print("Type another number: ");
        int number2 = Integer.parseInt(reader.nextLine());
        double division = (double) number/number2;
        System.out.println("Division "+ number+ " / "+number2+" = "+division);

    }
}
