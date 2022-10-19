package L02_Encapsulation_Exercises_P04_PizzaCalories;

import java.util.ArrayList;
import java.util.List;

public class Pizza {

    private String name;
    private Dough dough;
    private List<Topping> toppings;



    public Pizza(String name, int numberOfToppings) {

        this.name = name;
    }



    private void setName(String name) {
        if (!name.trim().isEmpty() && name.length() <= 15) {
            this.name = name;
        }else {
            throw new IllegalArgumentException("Pizza name should be between 1 and 15 symbols.");
        }
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    private void setToppings(int toppings) {

        if (toppings >= 0 && toppings <= 10){
            this.toppings = new ArrayList<>(toppings);
        }else {
            throw new IllegalArgumentException("Number of toppings should be in range [0..10].");
        }

    }

    public String getName() {
        return name;
    }

    public void addTopping(Topping topping){

        this.toppings.add(topping);

    }

    public double getOverallCalories(){

        return this.dough.calculateCalories() + this.toppings.stream().mapToDouble(t -> t.calculateCalories()).sum();


    }
}
