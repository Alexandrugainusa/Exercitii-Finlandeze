package week4.exercise81;

public class Program {
    public static void main(String[] args) {

        PasswordRandomizer passwordRandomizer = new PasswordRandomizer(13);
        System.out.println("Password: " + passwordRandomizer.createPassword());
        System.out.println("Password: " + passwordRandomizer.createPassword());
        System.out.println("Password: " + passwordRandomizer.createPassword());
        System.out.println("Password: " + passwordRandomizer.createPassword());
    }
}
