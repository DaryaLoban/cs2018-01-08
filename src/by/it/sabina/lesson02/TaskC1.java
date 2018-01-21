package by.it.sabina.lesson02;

import java.util.Scanner;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и выводит их сумму на экран в виде

Ввод:
34 26

Вывод:
Sum = 26
*/
class TaskC1 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System. out.println("Введите 2 числа");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int Sum=a+b;
        System.out.println("Сумма чисел");
        System.out.println("Sum = " + Sum);
    }





}
