package by.it.SemenovaO.lesson05;

/* Задачка на сортировку
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
*/


import java.util.Arrays;
import java.util.Scanner;

public class TaskC2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[20];

        //создание массива чисел
        for (int i = 0; i < array.length; i++)
            array[i] = sc.nextInt();

        System.out.println("Исходный массив:\n" + Arrays.toString(array));


        sort(array);

        //вывод элементов массива после сортировки  на печать
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    //сортировка пузырьковым методом по убыванию
    public static void sort(int[] arraySort) {
        boolean b;
        do {
            b = false;
            for (int i = arraySort.length - 1; i > 0; i--) {
                for (int j = 0; j < i; j++) {
                    if (arraySort[j] < arraySort[j + 1]) {
                        int temp = arraySort[j];
                        arraySort[j] = arraySort[j + 1];
                        arraySort[j + 1] = temp;
                        b = true;
                    }
                }
            }

        } while (b == true);
    }
}

