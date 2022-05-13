package week4.exercise83;

import libs.HangmanLogic;
import libs.HangmanUserInterface;

public class Main {
    public static void main(String[] args) {


        HangmanLogic logic = new HangmanLogic("parameter");
        HangmanUserInterface game = new HangmanUserInterface(logic);
        game.start();

        // cuvant
        // erori
        // mesaj
        // litere ghicite
    }
}
