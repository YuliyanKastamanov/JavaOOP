package L01_WorkingWithAbstraction.Labs.P04HotelReservation;

public class PriceCalculator {

    public static double calculatingFinalPrice (double pricePerDay, int days, Season season, DiscountType discountType){
        double finalPrice = pricePerDay * days * season.getMultiplier() * discountType.getDiscount();


        return finalPrice;
    }
}
