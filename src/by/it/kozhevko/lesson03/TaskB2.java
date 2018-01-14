package by.it.kozhevko.lesson03;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/*
Lesson 04. Task B2. Нужно написать программу, которая вводит три числа  a b c типа int с клавиатуры
и вычисляет корни квадратного уравнения a*a*x + b*x + c = 0:
1) Если два корня, то выводится два корня через пробел.
2) Если один корень, то выводится только одно число - корень.
3) Если нет действительных корней, то выводится сообщение об ошибке "Отрицательный дискриминант"

В программе должен быть определен статический метод dis вычисления дискриминанта,
который принимает на входе три числа типа int a,b,c
а на выходе возвращает число типа double

Примеры работы

Ввод:
2 5 3
Вывод:
-1.0 -1.5

Ввод:
2 4 2
Вывод:
-1.0

Ввод:
2 2 2
Вывод:
Отрицательный дискриминант

*/
class TaskB2 {
    private static double dis (double a, double b, double c){
        double d = b*b-4*a*c;
        return d;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        double det= dis(a,b,c);
        if (det>0){
            double x1= ((-b + Math.sqrt(det))/(2*a));
            double x2=((-b - Math.sqrt(det))/(2*a));
            System.out.println("x1=" + x1 + " x2=" + x2);}
            else  if (det == 0){
            double x1 = (-b/(2*a));
            System.out.println( "x1=" + x1);}
            else
            System.out.println("Отрицательный дискриминант");

        }
    }


