package week3;

import java.util.Scanner;

public class Exercise50 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        if (name.length() >=3){
            System.out.println("1. charcter: "+ name.charAt(0));
            System.out.println("1. charcter: "+ name.charAt(1));
            System.out.println("1. charcter: "+ name.charAt(2));
        }

    }
}
