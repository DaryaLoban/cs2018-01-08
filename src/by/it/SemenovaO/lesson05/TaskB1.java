package by.it.SemenovaO.lesson05;
/*
Создайте 5 различных строк в списке ArrayList:

1. Создайте список строк.
2. Добавьте в него 5 различных строк.
3. Выведите его размер на экран.
4. Используя цикл выведите его содержимое на экран, каждое значение с новой строки.

*/


import java.util.ArrayList;
import java.util.Scanner;

public class TaskB1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("понедельник");
        list.add("вторник");
        list.add("среда");
        list.add("четверг");
        list.add("пятница");

        int count = list.size();
        System.out.println(count);

        //вывод строк на экран
        for (int i = 0; i < count; i++)     System.out.println(list.get(i));
        }
    }
