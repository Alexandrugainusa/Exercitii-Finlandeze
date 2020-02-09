package week2;

import java.util.Scanner;

public class Exercise30 {
    public static void main(String[] args) {
        int start = 1;
        Scanner reader = new Scanner(System.in);
        System.out.print("Up to what number? ");
        int end = reader.nextInt();

        while (start <= end){
            System.out.println(start);
            start++;
        }
    }
}
