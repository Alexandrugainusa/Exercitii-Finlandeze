package week4.exercise75;

public class Main {
    public static void main(String[] args) {
        DecreasingCounter counter = new DecreasingCounter(10);

        counter.printValue();

        counter.decrease();
        counter.printValue();

        counter.decrease();
        counter.printValue();

        System.out.println("------------");

        DecreasingCounter counter1 = new DecreasingCounter(2);

        counter1.printValue();

        counter1.decrease();
        counter1.printValue();

        counter1.decrease();
        counter1.printValue();

        counter1.decrease();
        counter1.printValue();

        System.out.println("------------");

        DecreasingCounter counter2 = new DecreasingCounter(100);

        counter2.printValue();

        counter2.reset();
        counter2.printValue();

        counter2.decrease();
        counter2.printValue();

        System.out.println("------------");

        DecreasingCounter counter3 = new DecreasingCounter(100);

        counter3.printValue();

        counter3.decrease();
        counter3.printValue();

        counter3.decrease();
        counter3.printValue();

        counter3.reset();
        counter3.printValue();

        counter3.setInitial();
        counter3.printValue();
    }
}
