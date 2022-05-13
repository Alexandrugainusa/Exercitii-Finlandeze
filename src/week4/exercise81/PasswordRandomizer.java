package week4.exercise81;

import java.util.Random;

public class PasswordRandomizer {
    int lenght;


    public PasswordRandomizer(int lenght) {
        this.lenght = lenght;
    }

    public String createPassword(){
        Random random = new Random();
        String password = "";
        int index;
        for (int i = 0; i < this.lenght; i++) {
            index = random.nextInt(26);
            char symbol = "abcdefghijklmnopqrstuvwxyz".charAt(index);
            password += symbol;
        }
        return password;
    }
}
