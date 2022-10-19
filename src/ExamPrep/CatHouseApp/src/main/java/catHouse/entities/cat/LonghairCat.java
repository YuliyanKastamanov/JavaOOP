package catHouse.entities.cat;

public class LonghairCat extends BaseCat{

    private static final int LONGHAIRCAT_INITIAL_KG = 9;

    public LonghairCat(String name, String breed, double price) {
        super(name, breed, LONGHAIRCAT_INITIAL_KG, price);
    }

    @Override
    public void eating() {

        this.setKilograms(this.getKilograms() + 3);
    }
}
