package L01_WorkingWithAbstraction.Labs.P04HotelReservation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] data = scanner.nextLine().split("\\s+");

        double pricePerDay = Double.parseDouble(data[0]);
        int days = Integer.parseInt(data[1]);
        Season season = Season.valueOf(data[2]);
        DiscountType discount = DiscountType.valueOf(data[3]);

        double finalPrice = PriceCalculator.calculatingFinalPrice(pricePerDay, days, season, discount);

        System.out.printf("%.2f%n", finalPrice);




    }
}
