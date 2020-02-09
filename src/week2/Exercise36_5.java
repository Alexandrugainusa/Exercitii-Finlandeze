package week2;

import java.util.Scanner;

public class Exercise36_5 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type numbers: ");
        int number , sum = 0;
        int even = 0, odd = 0;
        int counterSum = sum;
        double average;
        while (true){
            number = Integer.parseInt(reader.nextLine());
            int counter = number;
            if (number == -1){
                System.out.println("Thank you and see you later!");
                System.out.println("The sum is "+ sum);
                System.out.println("How many numbers: "+ counterSum);
                average = (double)sum/counterSum;
                System.out.println("Average: "+ average);
                System.out.println("Even numbers "+even);
                System.out.println("Odd numbers "+odd);
                break;
            }
            if (number % 2 == 0){
                even++;
            }
            if (number % 2 != 0){
                odd++;
            }
            sum+=counter;
            counter++;
            counterSum++;

        }
    }
}
