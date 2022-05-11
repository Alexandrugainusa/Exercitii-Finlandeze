package week1;
/*
Create a program to calculate the sum of two numbers. At the beginning of the
program two variables are introduced and those variables hold the numbers to be summed.
Feel free to use other variables if you need to.

For example, if the variables hold numbers 5 and 4, the program should output:
5 + 4 = 9;
If the variables hold numbers 73457 and 12888, the program output should be:
73457 + 12888 = 86345
 */

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {

        int a = 5;
        int b = 4;
        int sum = a + b;
        System.out.println(a+" + "+ b +" = " + sum);

        int c = 73457;
        int d = 12888;
        int sum2 = c + d;
        System.out.println(c+" + "+ d +" = "+ sum2);


//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Your amount: ");
//        int amount = scanner.nextInt();
//        //your code goes here
//        System.out.println("Month 1");
//        int payment1 = (int) ((double)10/100 * amount);
//        int rAmount = amount - payment1;
//        System.out.println("Payment:" + payment1);
//        System.out.println("Remaining amount:" + rAmount);
//
//        System.out.println("Month 2");
//        int payment2 = (int) ((double)10/100 * rAmount);
//        int rAmount2 = rAmount - payment2;
//        System.out.println("Payment:" + payment2);
//        System.out.println("Remaining amount:" + rAmount2);
//
//        System.out.println("Month 3");
//        int payment3 = (int) ((double)10/100 * rAmount2);
//        int rAmount3 = rAmount2 - payment3;
//        System.out.println("Payment:" + payment3);
//        System.out.println("Remaining amount:" + rAmount3);

//        Scanner scanner = new Scanner(System.in);
//        int amount = scanner.nextInt();
//        int loan;
//        //your code goes here
//        for(int i=1;i<=3;i++)
//        {
//            loan =amount/10;
//            amount-=loan;
//        }
//        System.out.println(amount);
    }




}
