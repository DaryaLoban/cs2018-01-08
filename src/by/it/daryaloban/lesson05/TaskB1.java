package by.it.daryaloban.lesson05;
/*
Создайте 5 различных строк в списке ArrayList:

1. Создайте список строк.
2. Добавьте в него 5 различных строк.
3. Выведите его размер на экран.
4. Используя цикл выведите его содержимое на экран, каждое значение с новой строки.

*/


import java.util.ArrayList;

public class TaskB1 {

        public static void main(String[] args) throws Exception {
            ArrayList<String> list = new ArrayList<String>();

            list.add("111");
            list.add("222");
            list.add("333");
            list.add("444");
            list.add("555");

            System.out.println(list.size());

            for(int i = 0; i < 5; i++){
                System.out.println(list.get(i));
            }

        }
}
