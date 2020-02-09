package week3;

import java.util.Scanner;

public class Exercise51 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        int counter = 0;
        while ((name.length() > counter)) {
            System.out.println(counter + 1 + ". character: " + name.charAt(counter));
            counter++;
        }
    }
}
