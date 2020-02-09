package week2;

import java.util.Scanner;

public class Exercise33 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("First: ");
        int first = reader.nextInt();
        System.out.print("Last: ");
        int last =  reader.nextInt();
        int counter = first;
        int sum = 0;
        while (counter <= last){
            sum = sum + counter;
            counter++;
        }
        System.out.printf("The sum is %d", sum);
    }
}
