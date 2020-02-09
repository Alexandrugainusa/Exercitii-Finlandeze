package week1;
/*
In this exercise we create a program that asks the user for a password.
If the password is right, a secret message is shown to the user.

Type the password: turnip
Wrong!
Type the password: beetroot
Wrong!
Type the password: carrot
Right!
The secret is: jryy qbar!(ROT13-rotate by 13 places)
 */

import java.util.Scanner;

public class Exercise22 {
    public static void main(String[] args) {
        String password = "carrot".toLowerCase();
        String secretMessage = "fhcrepnyvsentvyvfgvprkcvnyvqbpvbhf!".toUpperCase();

        while (true) {
            Scanner reader = new Scanner(System.in);
            System.out.print("Type the password: ");
            String command = reader.nextLine();
            if (command.equals(password)) {
                System.out.println("Right!");
                System.out.println("\nThe secret is: "+ secretMessage);
                break;
            }
            System.out.println("Wrong!");
        }
    }
}
