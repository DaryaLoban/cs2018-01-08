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
}

