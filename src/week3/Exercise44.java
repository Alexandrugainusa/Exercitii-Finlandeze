package week3;

public class Exercise44 {
    public static void main(String[] args) {
        int answer =  least(2, 7);
        System.out.println("Least: " + answer);
    }

    public static int least(int number1, int number2) {
        if (number1 <= number2){
            return number1;
        }else {
            return number2;
        }
        //return Math.min(number1,number2);
    }
}
