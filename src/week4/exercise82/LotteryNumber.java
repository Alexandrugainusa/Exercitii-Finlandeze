package week4.exercise82;

import java.util.ArrayList;
import java.util.Random;

public class LotteryNumber {

    private ArrayList<Integer> numbers;

    public LotteryNumber() {
        this.numbers = new ArrayList<Integer>();
        this.drawNumbers();

    }

    public ArrayList<Integer> numbers(){
        return this.numbers;
    }

    public void drawNumbers(){
        this.numbers = new ArrayList<Integer>();
        Random random = new Random();
        int draw;
        while (this.numbers.size() < 7){
            draw = random.nextInt(49) + 1;
            if (draw > 0 && !containsNumber(draw)){
                this.numbers.add(draw);
            }
        }
    }

    public boolean containsNumber(int number){
        return this.numbers.contains(number);
    }
}
