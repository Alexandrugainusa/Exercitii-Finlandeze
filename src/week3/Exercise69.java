package week3;

import java.util.Scanner;

public class Exercise69 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a text: ");
        String text = reader.nextLine();
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }

    public static boolean palindrome(String text) {
        if (text.equals(reverse(text))){
            return true;
        }else{
            return false;
        }



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
