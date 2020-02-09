package week1;
/*
Create a program similar to the previous one except that it multiplies the two numbers instead of adding them.

For example, if the variables hold numbers 2 and 8, the program output should be:
2 * 8 = 16
If the variables hold numbers 277 and 111, the program output should be:
277 * 111 = 30747
 */

public class Exercise7 {
    public static void main(String[] args) {
        int a = 2;
        int b = 8;
        int multiplication = a*b;
        System.out.println(""+a + " * "+b + " = "+ multiplication);

        int c = 277;
        int d = 111;
        int multiplication2 = c*d;
        System.out.println(""+c + " * "+d + " = "+ multiplication2);


    }
}
