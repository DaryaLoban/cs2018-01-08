package by.it.shliapik.lesson05;
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
        ArrayList<String>f=new ArrayList<>();
        String d="hello";
        String b="my";
        String h="dear";
        String a="friends";
        String c="!!!";
        f.add(d);
        f.add(b);
        f.add(h);
        f.add(a);
        f.add(c);
        System.out.println(f.size());
        for (int i=0; i<=4; i++){
            System.out.println(f.get(i));
        }
    }
}
