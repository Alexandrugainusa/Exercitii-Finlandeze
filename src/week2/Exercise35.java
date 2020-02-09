package week2;

import java.util.Scanner;

public class Exercise35 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        int result = 0;
        int power = 0;
        while (power <= number){
            int powerNumber = (int)Math.pow(2,power);
            result = result + powerNumber;
            power++;
        }
        System.out.println("The result is "+ result);

    }
}
