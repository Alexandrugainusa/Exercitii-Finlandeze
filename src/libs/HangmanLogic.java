package libs;

public class HangmanLogic {

    // DO NOT TOUCH THIS
    private String word;
    private String guessedLetters;
    private int numberOfFaults;

    public HangmanLogic(String word) {
        this.word = word.toUpperCase();
        this.guessedLetters = "";
        this.numberOfFaults = 0;
    }

    public int numberOfFaults() {
        return this.numberOfFaults;
    }

    public String guessedLetters() {
        return this.guessedLetters;
    }

    public int losingFaultAmount() {
        return 12;
    }

    public void guessLetter(String letter) {
        // program here the functionality for making a guess
        if(!this.guessedLetters.contains(letter)){
            if(this.word.contains(letter)){
                this.guessedLetters += letter;
            } else {
                this.numberOfFaults++;
                this.guessedLetters += letter;
            }
        }
        // if the letter has already been guessed, nothing happens

        // it the word does not contains the guessed letter, number of faults increase
        // the letter is added among the already guessed letters
    }

//    public String hiddenWord() {
//        if(this.guessedLetters.length() == 0){
//            String hiddenWord ="";
//
//            for(int i=0; i<this.word.length(); i++){
//                hiddenWord +="_";
//            }
//            return hiddenWord;
//        } else {
//
//            return "_OO_";
//        }
//    }

    public String hiddenWord() {
        String hiddenWord = "";
        for (int i = 0; i < word.length(); i++){
            String letter = "" + word.charAt(i);
            if (guessedLetters.contains(letter)){
                hiddenWord += letter;
            }else {
                hiddenWord += "_";
            }
        }

        return hiddenWord;
    }
}
