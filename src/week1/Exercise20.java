package week1;
/*
Create a program that recognizes the following users:

Username  Password
alex	  mightyducks
emily	  cat
The program should check for the username and password as follows:

Type your username: alex
Type your password: mightyducks
You are now logged into the system!

Type your username: emily
Type your password: cat
You are now logged into the system!

Type your username: emily
Type your password: dog
Your username or password was invalid!
 */

import java.util.Scanner;

public class Exercise20 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your username: ");
        String username = reader.nextLine().toLowerCase();
        System.out.print("Type your password: ");
        String password = reader.nextLine().toLowerCase();
        if (username.equals("alex") && password.equals("mightyducks")){
            System.out.println("You are now logged into the system!");
        }else if (username.equals("emily") && password.equals("cat")){
            System.out.println("You are now logged into the system!");
        }else{
            System.out.println("Your username or password was invalid!");
        }

    }
}
