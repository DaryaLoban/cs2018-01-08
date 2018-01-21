package by.it.shliapik.lesson05;
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
    public static void main(String[] args)  {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer>spis=new ArrayList<>();
        ArrayList<Integer> d3=new ArrayList<>();
        ArrayList<Integer> d2=new ArrayList<>();
        ArrayList<Integer> ddr=new ArrayList<>();
    int b;
    for (int i=1; i<=20;i++){
        b=sc.nextInt();
        spis.add(b);
        if (b%3==0){
            d3.add(b);
        }
        if (b%2==0){
            d2.add(b);
        }
        if (b%2!=0&&b%3!=0) {
            ddr.add(b);
        }
    }
    printList(d3);
    printList(d2);
    printList(ddr);




    }

    private static void printList(List<Integer> list) {
        for (Integer aList : list) System.out.println(aList);
    }


}
