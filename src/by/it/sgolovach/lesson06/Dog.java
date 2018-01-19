package by.it.sgolovach.lesson06;

public class Dog {

    private int age;
    private String name;

    public Dog() {

    }

    public Dog(String name, int age) {
        this.age = age;
        this.name = name;
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
        return "Кличка: " + name + ". Возраст: " + age;
    }
}
