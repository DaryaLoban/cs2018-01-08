package by.it.diatchik.lesson05;
/*
Создайте 5 различных строк в списке ArrayList:

1. Создайте список строк.
2. Добавьте в него 5 различных строк.
3. Выведите его размер на экран.
4. Используя цикл выведите его содержимое на экран, каждое значение с новой строки.

*/


import java.util.ArrayList;

public class TaskB1 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Первый");
        list.add("Второй");
        list.add("Третий");
        list.add("Четвертый");
        list.add("Пятый");

        int n = list.size();
        System.out.println(n);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
