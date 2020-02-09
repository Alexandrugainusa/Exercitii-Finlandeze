package week4.exercise71;

import java.util.ArrayList;
import java.util.Collections;

public class Exercise71 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

//        list1.add(4);
//        list1.add(3);
//
//        list2.add(5);
//        list2.add(10);
//        list2.add(7);

        Collections.addAll(list1, 4,3);
        Collections.addAll(list2, 5, 10, 7, 4, 3);

        smartCombine(list1, list2);

        System.out.println(list1);
        System.out.println(list2);

    }

    public static void smartCombine(ArrayList<Integer> first, ArrayList<Integer> second){
       for (Integer number : second){
           if (!first.contains(number)){
               first.add(number);
           }
       }
    }
}
