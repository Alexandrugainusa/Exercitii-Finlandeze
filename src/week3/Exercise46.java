package week3;

public class Exercise46 {
    public static void main(String[] args) {
        double answer = average(4, 3, 6, 1);
        System.out.println("average: " + answer);

    }

    public static double average(int number1, int number2, int number3, int number4) {
        int sum = number1+number2+number3+number4;
        int elements = 4;
        double average = (double) sum/elements;
        return average;
    }



    public static int sum(int number1, int number2, int number3, int number4) {
        int sum = number1 + number2 + number3 + number4;
        return sum;
    }
}
