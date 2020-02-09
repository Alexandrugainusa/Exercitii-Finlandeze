package week3;

import java.util.Scanner;

public class Exercise49 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type tour name: ");
        String text = reader.nextLine();
        System.out.println("Last character: "+lastCharacter(text));

    }

    public static char lastCharacter(String text){
        int lastIndex =  text.length()-1;
        return text.charAt(lastIndex);
    }
}
