package week1;
/*
Create a program that asks the user for two integers and then prints their sum.
Type a number: 6
Type another number: 2
Sum of the numbers: 8
 */
import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number:");
        int number = Integer.parseInt(reader.nextLine());
        System.out.print("Type another number:");
        int number2 = Integer.parseInt(reader.nextLine());
        int sum = number + number2;
        System.out.println("Sum of the numbers: "+sum);
    }
}
