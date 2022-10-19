package catHouse.entities.cat;

public class ShorthairCat extends BaseCat{

    private static final int SHORTHAIRCAT_INITIAL_KG = 7;

    public ShorthairCat(String name, String breed, double price) {
        super(name, breed, SHORTHAIRCAT_INITIAL_KG, price);
    }


    @Override
    public void eating() {
        this.setKilograms(this.getKilograms() + 1);
    }
}
