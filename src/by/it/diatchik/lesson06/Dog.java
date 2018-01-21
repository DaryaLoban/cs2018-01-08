package by.it.diatchik.lesson06;

public class Dog {

    private int age;
    private String name;
    private int weight;
    private double power;

    public Dog() {
    }

    public Dog(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public Dog(String name, int age, int weight, double power) {
        this.age = age;
        this.name = name;
        this.weight = weight;
        this.power = power;
    }

    boolean win(Dog otherDog) {
        double win1 = 0.2 * this.age + 0.3 * this.weight + 0.5 * this.power;
        double win2 = 0.2 * otherDog.age + 0.3 * otherDog.weight + 0.5 * otherDog.power;
        if (win1 > win2)
            return true;
        return false;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Кличка: " + name + ". Возраст: " + age;
    }
}
