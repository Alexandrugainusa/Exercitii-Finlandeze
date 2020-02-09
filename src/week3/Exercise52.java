package week3;

import java.util.Scanner;

public class Exercise52 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        int reverse = name.length()-1;
        System.out.print("In reverse order: ");
        int i = 0;
        while (i <= reverse){
            System.out.print(name.charAt(reverse));
            reverse--;
        }

    }
}
