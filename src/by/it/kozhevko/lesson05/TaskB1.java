package by.it.kozhevko.lesson05;
/*
Создайте 5 различных строк в списке ArrayList:

1. Создайте список строк.
2. Добавьте в него 5 различных строк.
3. Выведите его размер на экран.
4. Используя цикл выведите его содержимое на экран, каждое значение с новой строки.

*/


public class TaskB1 {
    public static void main(String[] args) {
        String [] list = new String[5];
        int listCount = list.length;
        list[0]= "blabla";
        list[1]= "blablabla";
        list[2]= "blablablabla";
        list[3]= "blablablablabla";
        list[4]= "blablablablablabla";
        System.out.println(listCount);
        for (int i=0; i<list.length; i++){
            System.out.println(list[i]);
        }

    }

}
