package week2;

import java.util.Scanner;

public class Exercise34 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        int factorial = 1;
        int counter = 1;
        while(counter <= number){
            factorial = factorial*counter;
            counter++;
        }
        System.out.printf("Factorial is %s" ,factorial);

    }
}
