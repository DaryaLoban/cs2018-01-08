package by.it.kalabuhova.lesson06;

public class Dog {

  /*  public Dog(String name, int age) {
        this.age = age;
        this.name = name;
    }*/

    public Dog() {
    }

    public Dog(int age, String name) {
        this.age = age;
        this.name = name;
    }

    private int age;
    private String name;
    private int weight;
    private double power;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        String z = "Кличка: " + name + ". Возраст: " + age;
        return z;
    }

    boolean win(Dog otherDog) {
        double chanceThis = 0.2 * this.age + 0.3 * this.weight + 0.5 * this.power;
        double chanceOther = 0.2 * otherDog.age + 0.3 * otherDog.weight + 0.5 * otherDog.power;
        if (chanceThis > chanceOther) return true;
        else return false;
    }
}

