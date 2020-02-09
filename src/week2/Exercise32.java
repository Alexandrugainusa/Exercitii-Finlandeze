package week2;

import java.util.Scanner;

public class Exercise32 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;
        Scanner reader = new Scanner(System.in);
        System.out.print("Until what? ");
        int number = reader.nextInt();
        while (i <= number ){
            sum+=i;
            i++;
        }
        System.out.println("Sum is: "+ sum);


    }
}
