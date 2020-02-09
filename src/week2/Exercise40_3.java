package week2;

public class Exercise40_3 {
    public static void main(String[] args) {
        xmasTree(20);

    }

    private static void xmasTree(int height) {
        int counter = 0;
        while (counter < height) {
            printWhiteSpaces(height - counter);
            printStars(counter);
            printStars(counter - 1);
            System.out.println();
            counter++;
        }
        printRectangle(3, 2, height - 2);

    }

    private static void printRectangle(int width, int height, int space) {
        int j = 0;
        while (j < height) {
            printWhiteSpaces(space);

            printStars(width);
            System.out.println();
            j++;
        }
    }

    private static void printWhiteSpaces(int size) {
        int i = 0;
        while (i < size) {
            System.out.print(" ");
            i++;
        }
        System.out.print(" ");

    }

    private static void printStars(int amount) {
        int i = 0;
        while (i < amount) {
            System.out.print("*");
            i++;
        }
        System.out.print("");
    }
}
