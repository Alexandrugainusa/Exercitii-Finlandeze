package week1;
/*
Create a program that asks the user for a number and tells whether the number is even or odd.

Type a number: 2
Number 2 is even.

Type a number: 7
Number 7 is odd.
 */

import java.util.Scanner;

public class Exercise16 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Type a number: ");
        int number = read.nextInt();
        if (number % 2 == 0  ) {
            System.out.println("Number "+ number + " is even.");
        }else{
            System.out.println("Number "+ number + " is odd.");
        }
    }
}
