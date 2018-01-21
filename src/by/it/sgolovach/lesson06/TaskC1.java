package by.it.sgolovach.lesson06;

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

        String name1, name2;
        int age1, age2;
        int weight1, weight2;
        double power1, power2;
        Scanner sc = new Scanner(System.in);
        name1 = sc.next();
        age1 = sc.nextInt();
        weight1 = sc.nextInt();
        power1 = sc.nextDouble();
        name2 = sc.next();
        age2 = sc.nextInt();
        weight2 = sc.nextInt();
        power2 = sc.nextDouble();
        Dog dog1;
        dog1 = new Dog(age1, weight1, power1);
        Dog dog2;
        dog2 = new Dog(age2, weight2, power2);
        dog1.setName(name1);
        dog2.setName(name2);

        dog1.setAge(age1);
        dog2.setAge(age2);
        dog1.setWeight(weight1);
        dog2.setWeight(weight2);
        dog1.setPower(power1);
        dog2.setPower(power2);

        if (dog1.win(dog2) == true) System.out.println(dog1.getName());
        else System.out.println(dog2.getName());

    }

}
