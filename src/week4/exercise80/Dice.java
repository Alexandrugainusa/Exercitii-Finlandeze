package week4.exercise80;

import java.util.Random;

public class Dice {
    private Random random;
    private final int numberOfSides;

    public Dice(int numberOfSides) {
        this.numberOfSides = numberOfSides;
        random = new Random();
    }

    public int roll(){
        return 1 + random.nextInt(numberOfSides);
    }
}
