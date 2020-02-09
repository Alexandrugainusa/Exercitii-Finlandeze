package week3;

import java.util.Scanner;

public class Exercise47 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String text = reader.nextLine();
        System.out.println("Number of characters: " + calculateCharacters(text));
    }

    public static int calculateCharacters(String text) {
        return text.length();
    }
}
