package week2;

public class Exercise39_3 {
    public static void main(String[] args) {
        printRectangle(17,3);

    }

    private static void printRectangle(int width, int height){
        int j =0;
        while (j < height){
            printStars(width);
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
