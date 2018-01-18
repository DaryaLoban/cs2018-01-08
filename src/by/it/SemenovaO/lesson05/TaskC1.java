package by.it.SemenovaO.lesson05;
/*
Три массива
1.  Введите с клавиатуры 20 чисел, сохраните их в список и рассортируйте по трём другим спискам:
    Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
    Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
2.  Статический метод void printList(List<Integer> list) должен выводить на экран
    все элементы переданного ему списка list, каждый элемент - с новой строки.
3.  Используя метод printList выведите ваши три списка на экран.
    Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskC1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int[] array = new int[20];


        //вводим число с клавиатуры
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }


        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        ArrayList<Integer> c = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            Integer x = array[i];

            if (x % 3 == 0 && x % 2 == 0) {
                a.add(x);
                b.add(x);
            } else if (x % 3 == 0)
                a.add(x);

            else if (x % 2 == 0)
                b.add(x);

            else c.add(x);
        }

//создаем список result и добавляем данные из трех массивов
        ArrayList<Integer> result = new ArrayList<>();

        result.addAll(a);
        result.addAll(b);
        result.addAll(c);
        printList(result);
    }

    private static void printList(List<Integer> result) {
        for (Integer aList : result) {
            System.out.println(aList);
        }


    }


}
