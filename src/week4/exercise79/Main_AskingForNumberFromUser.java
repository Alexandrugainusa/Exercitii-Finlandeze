package week4.exercise79;

import java.util.Scanner;

public class Main_AskingForNumberFromUser {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        NumberStatistics sumOfall = new NumberStatistics();
        NumberStatistics even = new NumberStatistics();
        NumberStatistics odd = new NumberStatistics();

        System.out.println("Type numbers: ");

        while (true) {
            int userNumber = Integer.parseInt(reader.nextLine());
            if (userNumber == -1) {
                break;
            }
            sumOfall.addNumber(userNumber);
            if (userNumber % 2 == 0){
                even.addNumber(userNumber);
            }else{
                odd.addNumber(userNumber);
            }
        }
        System.out.println("sum: " + sumOfall.sum());
        System.out.println("even: " + even.sum());
        System.out.println("odd: " + odd.sum());
    }
}
