package by.it.sgolovach.lesson05;
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


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;


public class TaskC1 {
    public static void main(String[] args) throws Exception {
        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);
        ArrayList list = new ArrayList();
        ArrayList list1 = new ArrayList();
        ArrayList list2 = new ArrayList();
        ArrayList list3 = new ArrayList();
        for (int i = 0; i < 20; i++) {
            String a = reader.readLine();
            int b = Integer.parseInt(a);
            if ((b % 3 == 0) && (b % 2 == 0)) {
                list1.add(b);
                list2.add(b);
            } else if (b % 3 == 0) {
                list1.add(b);
            } else if (b % 2 == 0) {
                list2.add(b);
            } else {
                list3.add(b);
            }
        }
        for (int i = 0; i < list1.size(); i++) {
            int a = (int) list1.get(i);
            list.add(a);
        }
        for (int i = 0; i < list2.size(); i++) {
            int a = (int) list2.get(i);
            list.add(a);
        }
        for (int i = 0; i < list3.size(); i++) {
            int a = (int) list3.get(i);
            list.add(a);
        }
        printList(list);
    }

    private static void printList(List<Integer> list) {
        for (Integer aList : list) System.out.println(aList);
    }


}
