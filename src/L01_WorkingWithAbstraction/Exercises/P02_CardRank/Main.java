package L01_WorkingWithAbstraction.Exercises.P02_CardRank;

public class Main {
    public static void main(String[] args) {

        System.out.println("Card Ranks:");
        CardRank[] cardRank = CardRank.values();

        for (CardRank currentCard: cardRank) {

            System.out.printf("Ordinal value: %d; Name value: %s%n",currentCard.ordinal(), currentCard.name());

        }
    }
}
