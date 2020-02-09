package week1;
/*
Create a program that asks the user for two integers and then prints the larger of the two.
Type a number: 20
Type another number: 14
The bigger number of the two numbers given was: 20
 */

import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Tyoe a number: ");
        int firstNumber = Integer.parseInt(read.nextLine());
        System.out.print("Type another number: ");
        int secondNumber = Integer.parseInt(read.nextLine());
        System.out.println("The bigger number of the two numbers given was: " + Math.max(firstNumber,secondNumber));

    }
}
