package by.it.sgolovach.lesson05;

/* Задачка на сортировку
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class TaskC2 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            String a = reader.readLine();
            array[i] = Integer.parseInt(a);
        }
        sort(array);
    }

    //Напишите тут ваш код
    public static void sort(int[] array) {
        int a, b, t;
        int size;
        size = 20;
        for (a = 1; a < size; a++)
            for (b = size - 1; b >= a; b--) {
                if (array[b] > array[b - 1]) {
                    t = array[b - 1];
                    array[b - 1] = array[b];
                    array[b] = t;
                }
            }
        for (int i = 0; i <size ; i++) {
            System.out.println(array[i]);
        }
        //Напишите тут ваш код
    }

}
