package week2;

import java.util.Scanner;

public class Exercise36_1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type numbers: ");
        int numbers;
        while (true){
            numbers = Integer.parseInt(reader.nextLine());
            if (numbers == -1){
                System.out.println("Thank you and see you later!");
                break;
            }
        }
    }
}
