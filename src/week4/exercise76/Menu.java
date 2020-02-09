package week4.exercise76;

import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<String>();
    }

    public void addMeal(String meal){
        if (!this.meals.contains(meal)){
            this.meals.add(meal);
        }

    }

    public void printMeals(){
        for (String meal : meals){
            System.out.println(meal);
        }
    }

    public void clearMenu(){
        this.meals.clear();

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Menu{");
        sb.append("meals=").append(meals);
        sb.append('}');
        return sb.toString();
    }
}
