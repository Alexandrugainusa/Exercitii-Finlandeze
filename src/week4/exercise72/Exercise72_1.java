package week4.exercise72;

import libs.Account;

public class Exercise72_1 {
    public static void main(String[] args) {
        Account account = new Account("Alex's account",100);
        account.deposit(20);
        System.out.println(account.toString());
    }

}
