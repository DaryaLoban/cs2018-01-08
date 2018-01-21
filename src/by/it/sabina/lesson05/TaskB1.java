package by.it.sabina.lesson05;
/*
Создайте 5 различных строк в списке ArrayList:

1. Создайте список строк.
2. Добавьте в него 5 различных строк.
3. Выведите его размер на экран.
4. Используя цикл выведите его содержимое на экран, каждое значение с новой строки.

*/


public class TaskB1 {
    public static void main(String args[]) {
        String[] strings =new String[5];
        strings [0]= "привет";
        strings [1]= "джава";
        strings [2]= "мир";
        strings [3]= "дружба";
        strings [4]= "любовь";

        System.out.println();
        for(String string:strings){
            System.out.println(string);

        }
    }

}
