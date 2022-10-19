package L04_InterfacesAndAbstraction_Labs_P02_CarShopExtended;

public interface Rentable extends Car {

    Integer getMinRentDay();
    Double getPricePerDay();
}
