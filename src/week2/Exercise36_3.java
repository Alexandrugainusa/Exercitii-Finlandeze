package week2;

import java.util.Scanner;

public class Exercise36_3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type numbers: ");
        int number , sum = 0;
        int counterSum = sum;
        while (true){
            number = Integer.parseInt(reader.nextLine());
            int counter = number;
            if (number == -1){
                System.out.println("Thank you and see you later!");
                System.out.println("The sum is "+ sum);
                System.out.println("How many numbers: "+ counterSum);
                break;
            }
            sum = sum + counter;
            counterSum++;
            counter++;
        }
    }
}
