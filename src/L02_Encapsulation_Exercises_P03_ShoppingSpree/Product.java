package L02_Encapsulation_Exercises_P03_ShoppingSpree;

public class Product {


    private String name;
    private double cost;


    public Product(String name, double cost) {
        setName(name);
        setCost(cost);
    }

    private void setName(String name) {

        if(!name.trim().isEmpty()) {
            this.name = name;
        }else {
            throw new IllegalArgumentException("Name cannot be empty");
        }
    }

    private void setCost(double cost) {

        if(cost >= 0) {
            this.cost = cost;
        }else {
            throw new IllegalArgumentException("Money cannot be negative");
        }
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }
}
