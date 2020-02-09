package week4.exercise72;

import libs.Account;

public class Exercise72_2 {
    public static void main(String[] args) {
        Account mattAccount = new Account("Matt's account",1000);
        Account myAccount = new Account("My account",0);
        mattAccount.withdrawal(100.0);
        myAccount.deposit(100.0);

        System.out.println(mattAccount.toString());
        System.out.println(myAccount.toString());
    }
}
