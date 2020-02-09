package week4.exercise77;

public class Main {
    public static void main(String[] args) {
        LyyraCard card = new LyyraCard(50);
        System.out.println(card);

        card.payEconomical();
        System.out.println(card);

        card.payGourmet();
        card.payEconomical();
        System.out.println(card);
        System.out.println("-----------------------");

        LyyraCard card2 = new LyyraCard(5);
        System.out.println(card2);

        card2.payGourmet();
        System.out.println(card2);

        card2.payGourmet();
        System.out.println(card2);
        System.out.println("-----------------------");

        LyyraCard card3 = new LyyraCard(10);
        System.out.println(card3);

        card3.loadMoney(15);
        System.out.println(card3);

        card3.loadMoney(10);
        System.out.println(card3);

        card3.loadMoney(200);
        System.out.println(card3);
        System.out.println("-----------------------");

        LyyraCard card4 = new LyyraCard(10);
        System.out.println("Pekka: " + card4);
        card4.loadMoney(-15);
        System.out.println("Pekka: " + card4);
        System.out.println("-----------------------");

        LyyraCard cardPekka = new LyyraCard(20);
        LyyraCard cardBrian = new LyyraCard(30);
        cardPekka.payGourmet();
        cardBrian.payEconomical();
        System.out.println(cardPekka);
        System.out.println(cardBrian);

        cardPekka.loadMoney(20);
        cardBrian.payGourmet();
        System.out.println(cardPekka);
        System.out.println(cardBrian);

        cardPekka.payEconomical();
        cardPekka.payEconomical();
        cardBrian.loadMoney(50);
        System.out.println(cardPekka);
        System.out.println(cardBrian);
    }
}
