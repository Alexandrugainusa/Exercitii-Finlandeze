package week2;

import java.util.Scanner;

public class Exercise38 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("How many? ");
        int timesPrint = reader.nextInt();

        int i = 0;
        while (i < timesPrint) {
            printText();
            i++;
        }
//        for (int i = 0; i < timesPrint; i++) {
//            printText();
//        }
    }

    public static void printText() {
        System.out.println("In the beginning there were the swamp, the hoe and Java.");
    }
}
