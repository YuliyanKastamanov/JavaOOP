package L03_Inheritance_Exercises_P06_Animals;

public class Dog extends Animal {

    public Dog(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    public String produceSound() {

        return "Woof!";
    }


}
