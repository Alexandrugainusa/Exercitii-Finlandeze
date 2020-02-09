package week1;
/*
Create a program that asks for the names and ages of two users. After that the program prints the sum of their ages.

Type your name: Matti
Type your age: 14

Type your name: Arto
Type your age: 12

Matti and Arto are 26 years old in total.

 */

import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Type your name: ");
        String firstName = read.nextLine();
        System.out.print("Type your age: ");
        int age = Integer.parseInt(read.nextLine());
        System.out.print("Type your name: ");
        String secondName = read.nextLine();
        System.out.print("Type your age: ");
        int age2 = Integer.parseInt(read.nextLine());
        int sumAge = age+age2;

        System.out.println(firstName+" and "+secondName+" are "+sumAge+" years old in total.");
    }

}
