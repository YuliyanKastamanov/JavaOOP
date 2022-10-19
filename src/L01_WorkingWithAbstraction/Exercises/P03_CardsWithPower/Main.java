package L01_WorkingWithAbstraction.Exercises.P03_CardsWithPower;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String cardName = scanner.nextLine();
        String cardSuit = scanner.nextLine();

        int cardPower = RankPower.valueOf(cardName).getPower() + SuitPower.valueOf(cardSuit).getPower();

        System.out.printf("Card name: %s of %s; Card power: %d%n", cardName, cardSuit, cardPower);



    }
}
