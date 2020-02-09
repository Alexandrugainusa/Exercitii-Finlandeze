package week4.exercise76;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Menu mainMeniu = new Menu();
        mainMeniu.addMeal("Hamburger");
        mainMeniu.addMeal("Fish'n'Chips");
        mainMeniu.addMeal("Sauerkraut");
        mainMeniu.addMeal("Hamburger");


        mainMeniu.printMeals();
        System.out.println(mainMeniu);

        mainMeniu.clearMenu();
        System.out.println(mainMeniu);



    }
}
