package by.it.sabina.lesson02;

import java.util.Scanner;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и 4 раза выводит их сумму с обозначением системы счисления на экран в
ДЕСЯТИЧНОМ ДВОИЧНОМ ШЕСТНАДЦАТИРИЧНОМ ВОСЬМИРИЧНОМ виде

Вот пример ввода с клавиатуры:
34 26

Тогда вывод ожидается такой:
DEC:34+26=60
BIN:100010+11010=111100
HEX:22+1a=3c
OCT:42+32=74
*/
class TaskC2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println ("Введите 2 числа:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        String c = Integer.toBinaryString(a);
        String d = Integer.toBinaryString(b);
        String e = Integer.toHexString(a).toUpperCase();
        String f = Integer.toHexString(b).toUpperCase();
        String g = Integer.toOctalString(a);
        String h = Integer.toOctalString(b);
        int Sum1=a+b;
        String Sum2=c+d;
        String Sum3=e+f;
        String Sum4=g+h;
        System.out.println ("Сумма чисел в разных системах счисления");
        System.out.println ("DEC: " + a + "+" + b + "=" + Sum1);
        System.out.println ("BIN: " + c + "+" + d + "=" + Sum2);
        System.out.println ("HEX: " + e + "+" + f + "=" + Sum3);
        System.out.println ("OCT: " + g + "+" + h + "=" + Sum4);
    }


}
