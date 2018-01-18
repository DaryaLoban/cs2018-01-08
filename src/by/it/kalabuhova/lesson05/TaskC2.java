package by.it.kalabuhova.lesson05;

/* Задачка на сортировку
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
*/

import java.util.Arrays;
import java.util.Scanner;

public class TaskC2 {
    //Напишите тут ваш код
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = sc.nextInt();
        }
        sort(array);
//        System.out.println(Arrays.toString(array));
        for (int i = 0; i < 20; i++) System.out.println(array[i]);
    }

    public static void sort(int[] array) {
        int b, t;
        for (int i = 1; i < 20; i++)
            for (b = 19; b >= i; b--) {
                if (array[b - 1] < array[b]) {
                    t = array[b - 1];
                    array[b - 1] = array[b];
                    array[b] = t;
                }
            }
    }

}
