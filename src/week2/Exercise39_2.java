package week2;

public class Exercise39_2 {
    public static void main(String[] args) {
        printSquare(4);

    }

    private static void printSquare(int sideSize) {
        int j = 0;
        while (j < sideSize) {
            printStars(sideSize);
            System.out.print("");
            j++;
        }
    }

    private static void printStars(int amount) {
        int i = 0;
        while (i < amount) {
            System.out.print("*");
            i++;
        }
        System.out.println("");
    }
}

