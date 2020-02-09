package week2;

public class Exercise40_1_2 {
    public static void main(String[] args) {
        printTriangle(4);

    }

    private static void printTriangle(int size){
       int counter = 0;
       while (counter < size){
           printWhiteSpaces(size-counter);
           printStars(counter);
           System.out.println();
           counter++;
       }
    }

    private static void printWhiteSpaces(int size){
        int i = 0;
        while (i < size){
            System.out.print(" ");
            i++;
        }
        System.out.print(" ");
    }

    private static void printStars(int amount){
        int i = 0;
        while (i <= amount){
            System.out.print("*");
            i++;
        }
        System.out.print("");
    }
}
