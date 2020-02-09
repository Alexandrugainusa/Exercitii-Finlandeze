package week1;
/*
Create a program that gives the course grade based on the following table.
Points	Grade
0–29	failed
30–34	1
35–39	2
40–44	3
45–49	4
50–60	5
Example outputs:
Type the points [0-60]: 37
Grade: 2

Type the points [0-60]: 51
Grade: 5

 */

import java.util.Scanner;

public class Exercise18 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Type the points [0-60]: ");
        int points = Integer.parseInt(read.nextLine());
        if (0 <= points && points <= 29){
            System.out.println("Failed");
        }else if (points >= 30  && points <= 34){
            int grade = 1;
            System.out.println("Grade: " + grade);
        }else if (points >= 35 && points <= 39){
            int grade = 2;
            System.out.println("Grade: "+ grade);
        }else if (points >= 40 && points <= 44){
            int grade = 3;
            System.out.println("Grade: "+ grade);
        }else if (points >= 45 && points <= 49){
            int grade = 4;
            System.out.println("Grade: "+ grade);
        }else if (points >= 50 && points <= 60){
            int grade = 5;
            System.out.println("Grade: "+ grade);
        }else{
            System.out.println("You are not in the [0-60] range!");
        }

    }
}
