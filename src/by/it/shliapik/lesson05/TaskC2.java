package by.it.shliapik.lesson05;

/* Задачка на сортировку
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
*/

import java.util.Scanner;

public class TaskC2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] b = new int[20];
        for (int i = 0; i <b.length; i++) {
            b[i] = sc.nextInt();
        }
        sort(b);
    }

    public static void sort(int[] array) {
        for (int a = 1; a <= array.length; a++) {
            for (int d = (array.length - 1); d >= a; d--) {
                if (array[d - 1] < array[d]) {
                    int t = array[d - 1];
                    array[d - 1] = array[d];
                    array[d] = t;
                }

            }
        }
        for (int i:array) {
            System.out.println(i);
        }
    }
}
