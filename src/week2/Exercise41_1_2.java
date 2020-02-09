package week2;

import java.util.Random;
import java.util.Scanner;

public class Exercise41_1_2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int drawNumber = drawNumber();
        while (true){
            System.out.print("Guess a number: ");
            int guessNumber = reader.nextInt();
            if (guessNumber < drawNumber) {
                System.out.println("The number is greater");
            }else if (guessNumber > drawNumber){
                System.out.println("The number is lesser");
            }else{
                System.out.println("Congratulations, your guess is correct!");
                break;
            }
        }

    }

    public static int drawNumber(){
        return new Random().nextInt(100)+1;
    }
}
