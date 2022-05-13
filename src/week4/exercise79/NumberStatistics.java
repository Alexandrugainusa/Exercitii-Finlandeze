package week4.exercise79;

public class NumberStatistics {
    private int amountOfNumbers;
    private int counter = 0;
    private int sum;

    public NumberStatistics() {
    }

    public void addNumber(int number) {
        this.counter += number;
        this.amountOfNumbers++;

    }

    public int amountOfNumbers() {
        return amountOfNumbers;
    }

    public int sum() {
        this.sum = counter;
        return sum;
    }

    public double average() {
        if (this.amountOfNumbers == 0) {
            return 0.0;
        } else {
            return (double) this.sum / this.amountOfNumbers;
        }
    }
}
