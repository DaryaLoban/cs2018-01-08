package by.it.shliapik.lesson06;

/*
Доработайте класс Dog.

1) Добавьте два новых поля с геттерами и сеттерми (!!!!)
private int weight; //вес собаки
private double power; //сила укуса собаки

2) Напишите экземплярный метод в классе Dog
boolean win(Dog otherDog)
    {... тело метода...}
который рассчитывает, кто из двух собак победит эта (this) или та (otherDog).

Расчет должен быть таким.
    Шансы на победу = 0.2 * возраст + 0.3 * вес + 0.5 * силу укуса.

Побеждает та собака, у которой больше шансов на победу.
Если победила эта (this), то метод win возвращает true, иначе false

3) Проверка.
В классе TaskC1 с клавиатуры через Scanner вводятся две собаки в формате
кличка возраст вес сила
кличка возраст вес сила
(всего получается 8 чтений разных данных)

Создайте этих собак, определите победителя с помощью созданного
в классе Dog метода boolean win(Dog dog).
Напечатайте кличку победителя.
*/


import java.util.Scanner;

public class TaskC1 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        String n1=sc.next();
        int age1=sc.nextInt();
        int w1=sc.nextInt();
        double p1=sc.nextDouble();
        String n2=sc.next();
        int age2=sc.nextInt();
        int w2=sc.nextInt();
        double p2=sc.nextDouble();

        Dog dog=new Dog(n1, age1);
        Dog other=new Dog(n2, age2);
        dog.setWeight(w1);
        dog.setPower(p1);
        other.setWeight(w2);
        other.setPower(p2);
        if (dog.win(other)) System.out.println(dog.getName());
        else System.out.println(other.getName());
    }
}
