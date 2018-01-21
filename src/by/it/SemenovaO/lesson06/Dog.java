package by.it.SemenovaO.lesson06;


public class Dog {

    public Dog() {
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private String name;
    private int age;
    private int weight;
    private double power;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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


    boolean win(Dog otherdog) {
        double chance1, chance2;
        chance1 = 0.2 * this.getAge() + 0.3 * this.getWeight() + 0.5 * this.getPower();
        chance2 = 0.2 * otherdog.getAge() + 0.3 * otherdog.getWeight() + 0.5 * otherdog.getPower();
        if (chance1 > chance2) return true;

        else return false;
    }
}






