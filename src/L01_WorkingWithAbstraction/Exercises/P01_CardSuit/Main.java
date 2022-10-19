package L01_WorkingWithAbstraction.Exercises.P01_CardSuit;

public class Main {
    public static void main(String[] args) {

        System.out.println("Card Suits:");
        Suits[] suits = Suits.values();

        for (Suits suit: suits) {

            System.out.printf("Ordinal value: %d; Name value: %s%n",suit.ordinal(), suit.name());

        }

    }
}
