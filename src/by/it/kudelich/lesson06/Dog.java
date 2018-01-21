package by.it.kudelich.lesson06;

public class Dog {
    Dog() {

    }

    int age;
    String name;

    void setAge(int age) {
        this.age = age;
    }
    int getAge() {
        return age;
    }

    String getName() {
        return name;
    }
    void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Кличка: " + name + ". Возраст: " + age;
    }
}
