package week3;

import java.util.Scanner;

public class Exercise48 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type tour name: ");
        String text = reader.nextLine();
        System.out.println("First character: " + firstCharacter(text));
    }

    public static char firstCharacter(String text) {
        return text.charAt(0);
    }
}
