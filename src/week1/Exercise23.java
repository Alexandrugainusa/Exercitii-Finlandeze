package week1;

import libs.Graph;

import java.util.Scanner;

public class Exercise23 {
    public static void main(String[] args) {

        while (true){
            Scanner reader  = new Scanner(System.in);
            System.out.println("Add 3 daily temperatures: ");

            double temperature = Double.parseDouble(reader.nextLine());

            if (temperature >= -30 && temperature < 40) {
                Graph.addNumber(reader.nextDouble());
                Graph.addNumber(reader.nextDouble());
                Graph.addNumber(reader.nextDouble());
                System.out.println("Graph is: " + temperature);
                break;
            }
        }
    }
}
