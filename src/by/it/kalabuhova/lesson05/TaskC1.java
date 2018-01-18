package by.it.kalabuhova.lesson05;
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
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskC1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
       /* BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList list = new ArrayList();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(Integer.parseInt(s));
        }*/
        ArrayList list = new ArrayList();
        for (int i = 0; i < 20; i++) {
            int x = sc.nextInt();
            list.add(Integer.valueOf(x));
        }
        ArrayList listDel3 = new ArrayList();
        ArrayList listDel2 = new ArrayList();
        ArrayList listOst = new ArrayList();
        for (int i = 0; i < 20; i++) {
            Integer x = (Integer) list.get(i);
            if (x % 2 == 0) listDel2.add(x);
            if (x % 3 == 0) listDel3.add(x);
            if (x % 2 != 0 && x % 3 != 0) listOst.add(x);
        }
    printList(listDel3);

    printList(listDel2);

    printList(listOst);

}

    private static void printList(List<Integer> list) {
        // for (Integer aList : list) System.out.println(aList);
        int n = list.size();
        for (int i = 0; i < n; i++) System.out.println(list.get(i));
    }
}