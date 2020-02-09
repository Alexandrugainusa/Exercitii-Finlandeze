package week4.exercise77;

public class LyyraCard {
    private double balance;
    private double initialBalance;

    public LyyraCard(double balanceAtStart) {
        this.balance = balanceAtStart;
        this.initialBalance = balanceAtStart;
    }

    public void payEconomical() {
        if (this.balance >= 2.50){
            this.balance -=2.50;
        }
    }

    public void payGourmet() {
        if (this.balance >= 4.00){
            this.balance -= 4.00;
        }
    }

    public void loadMoney(double amount) {
        if (amount < 0){
            this.balance = initialBalance;
        }else if (balance + amount < 150 ) {
            balance+=amount;
        }else {
            balance = 150;
        }


    }

    public String toString() {
        return "The card has "+ this.balance + " euros";
    }
}
