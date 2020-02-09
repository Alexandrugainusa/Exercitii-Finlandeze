package week3;

import java.util.ArrayList;

public class Exercise64 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The average is: " + average(list));
    }

    public static double average(ArrayList<Integer> list) {
        int sum = sum(list);
        return (double) sum / list.size();

    }

    public static int sum(ArrayList<Integer> list) {
        Integer sum = 0;
        for (Integer numbers : list){
            sum+=numbers;
        }
        return sum;


    }
}
