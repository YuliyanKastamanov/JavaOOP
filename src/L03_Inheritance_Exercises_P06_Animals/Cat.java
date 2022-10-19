package L03_Inheritance_Exercises_P06_Animals;

public class Cat extends Animal {
    public Cat(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    public String produceSound() {

            return "Meow meow";
    }


}
