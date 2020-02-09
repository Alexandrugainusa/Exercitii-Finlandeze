package week3;

import java.util.Scanner;

public class Exercise56 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }

    public static String reverse(String text) {
        int i = text.length()-1;
        String reverse = "";
        while (i >= 0){
          reverse= reverse + text.charAt(i);
            i--;
        }
        return reverse;
    }
}
