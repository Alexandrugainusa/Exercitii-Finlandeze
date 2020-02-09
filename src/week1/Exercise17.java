package week1;
/*
Create a program that asks the user for two numbers and prints the greater of those two.
The program should also handle the case in which the two numbers are equal.
Example outputs:
Type the first number: 5
Type the second number: 3
Greater number: 5

Type the first number: 5
Type the second number: 8
Greater number: 8

Type the first number: 5
Type the second number: 5
The numbers are equal!
 */

import java.util.Scanner;

public class Exercise17 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Type the first number: ");
        int firstNumber = read.nextInt();
        System.out.println("Type the second number: ");
        int secondNumber = read.nextInt();
        if (firstNumber > secondNumber){
            System.out.println("Greater number: " + firstNumber);
        }else if (secondNumber > firstNumber){
            System.out.println("Greater number: " + secondNumber);
        }else{
            System.out.println("The numbers are equal!");
        }
    }
}
