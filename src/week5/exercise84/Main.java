package week5.exercise84;

public class Main {
    public static void main(String[] args) {

        Counter v1 = new Counter();
        v1.value();
        System.out.println(v1);

        Counter v2 = new Counter(2,true);
        System.out.println(v2);
        v2.increase();
        System.out.println(v2);

        Counter v3 = new Counter(4,true);
        v3.decrease(3);
        System.out.println(v3);
    }
}
