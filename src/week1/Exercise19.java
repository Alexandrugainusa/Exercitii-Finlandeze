package week1;
/*
Create a program that asks for the user's age and checks that it is reasonable (at least 0 and at most 120).
How old are you? 10
OK
How old are you? 55
OK
How old are you? -3
Impossible!
How old are you? 150
Impossible!
 */

import java.util.Scanner;

public class Exercise19 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("How old are you? ");
        int age = read.nextInt();
        if (age >= 0 && age <=120){
            System.out.println("OK");
        }else{
            System.out.println("Impossible!");
        }
    }
}
