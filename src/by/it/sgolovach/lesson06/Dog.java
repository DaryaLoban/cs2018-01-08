package by.it.sgolovach.lesson06;

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

    public Dog(int age, int weight, double power) {
        this.age = age;
        this.weight = weight;
        this.power = power;
    }

    boolean win() {
        return win();
    }

    boolean win(Dog otherDog) {
        double myChance = 0.2 * age + 0.3 * weight + 0.5 * power;
        double otherChance = 0.2 * otherDog.age + 0.3 * otherDog.weight + 0.5 * otherDog.power;
        if (myChance > otherChance) return true;
        return false;
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

    public int getWeight() {
        return weight;
    }

    public double getPower() {
        return power;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setPower(double power) {
        this.power = power;
    }


    @Override
    public String toString() {
        return "Кличка: " + name + ". Возраст: " + age;
    }


}
