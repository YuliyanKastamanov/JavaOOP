package L03_Inheritance_Exercises_P06_Animals;

public class Animal {

    private String name;
    private int age;
    private String gender;

    public Animal(String name, int age, String gender) {
        this.setName(name);
        this.setAge(age);
        this.setGender(gender);
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {


        if(!name.trim().isEmpty()){
            this.name = name;
        }else {
            throw new IllegalArgumentException("Invalid input!");
        }


    }

    public int getAge() {
        return age;
    }

    private void setAge(int age) {
        if(age >=0) {
            this.age = age;
        }else {
            throw new IllegalArgumentException("Invalid input!");
        }
    }

    public String getGender() {
        return gender;
    }

    private void setGender(String gender) {

        if(!gender.trim().isEmpty()){
            this.gender = gender;
        }else {
            throw new IllegalArgumentException("Invalid input!");
        }
    }

    public  String produceSound(){
        return null;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(String.format("%s%n", this.getClass().getSimpleName()));
        stringBuilder.append(String.format("%s %d %s%n", this.name, this.age, this.gender ));
        stringBuilder.append(this.produceSound());
        return stringBuilder.toString();
    }
}
