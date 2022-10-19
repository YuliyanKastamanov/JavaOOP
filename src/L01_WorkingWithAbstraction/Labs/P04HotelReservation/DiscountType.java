package L01_WorkingWithAbstraction.Labs.P04HotelReservation;

public enum DiscountType {

    None(1),
    SecondVisit(0.9),
    VIP(0.8);


    private double discount;

    DiscountType(double discount) {
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }
}
