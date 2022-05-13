package week4.exercise82;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {

        LotteryNumber lotteryNumber = new LotteryNumber();
        ArrayList<Integer> numbers = lotteryNumber.numbers();
        System.out.println("Lottery numbers: ");

        for (int number : numbers){
            System.out.println(number + " ");
        }
        System.out.println();
    }
}
