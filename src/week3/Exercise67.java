package week3;

import java.util.ArrayList;

public class Exercise67 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The variance is: " + variance(list));

    }

    public static double variance(ArrayList<Integer> list) {
        double sum = 0;
        double averageOfList = average(list);
        for (int item : list){
            sum+= Math.pow((item - averageOfList),2);
        }
        return sum / (list.size()-1);

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
