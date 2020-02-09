package week1;
/*
Create a program that asks for the user's age and tells whether the user has
reached the age of majority (i.e. 18 years old or older).

How old are you? 12
You have not reached the age of majority yet!

How old are you? 32
You have reached the age of majority!

 */

import java.util.Scanner;

public class Exercise15 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("How old are you?");
        int age = read.nextInt();
        if (age <= 18){
            System.out.println("You have not reached the age of majority yet!");
        }else{
            System.out.println("You have reached the age of majority!");
        }

    }
}
