package week2;

public class Exercise39_4 {
    public static void main(String[] args) {
        printTriangle(4);
    }

    private static void printTriangle(int size){
        int j = 0;
        while (j <= size){
            printStars(j);
            System.out.print("");
            j++;
        }
    }

    private static void printStars(int amount){
        int i = 0;
        while (i < amount){
            System.out.print("*");
            i++;
        }
        System.out.println("");
    }
}
