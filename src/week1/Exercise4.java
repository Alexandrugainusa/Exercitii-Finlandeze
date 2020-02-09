package week1;
/*
The exercise file initially contains a program which prints:
Chickens:
3
Bacon (kg):
5.5
A tractor:
There is none!

In a nutshell:
3
5.5
There is none!
 */

public class Exercise4 {
    public static void main(String[] args) {
        String chickens = "Chickens:";
        int firstNumber = 3;
        String bacon = "Bacon (kg):";
        double secondNumber = 5.5;
        String tractor = "A tractor:";
        String text = "There is none!";
        String nutshell = "In a nutshell:";

        System.out.println(chickens + '\n' + firstNumber + '\n' + bacon + '\n' + secondNumber + '\n' + tractor + '\n' + text + '\n');
        System.out.println(nutshell + '\n' + firstNumber + '\n' + secondNumber + '\n' + text);
        System.out.println("---------------");

        /*
        Change the program in the specified places so that it will print:
        Chickens:
        9000
        Bacon (kg):
        0.1
        A tractor:
        Zetor

        In a nutshell:
        9000
        0.1
        Zetor
         */
        int thirdNumber = 9000;
        double fourthNumber = 0.1;
        String name = "Zetor";

        System.out.println(chickens + '\n' + thirdNumber + '\n' + bacon + '\n' + fourthNumber + '\n' + tractor + '\n' + name + '\n');
        System.out.println(nutshell + '\n' + thirdNumber + '\n' + fourthNumber + '\n' + name);



    }
}
