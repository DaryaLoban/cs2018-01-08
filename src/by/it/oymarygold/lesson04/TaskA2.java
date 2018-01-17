package by.it.oymarygold.lesson04;

/*

День недели
Ввести с клавиатуры номер дня недели, в зависимости от номера вывести название
«понедельник», «вторник», «среда», «четверг», «пятница», «суббота», «воскресенье»,
если введен номер больше 7 или меньше 1 – вывести «такого дня недели не существует».


Требования:
1. Программа должна считывать число c клавиатуры.
2. Программа должна выводить текст на экран.
3. Если введено число от 1 до 7, необходимо вывести день недели.
4. Если введено число не входящее в интервал от 1 до 7,
    то вывести уведомление что такого дня недели не существует.
5.  Нельзя использовать массивы или коллекции Java.

Пример для номера 5:
пятница

Пример для номера 10:
такого дня недели не существует

 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TaskA2 {
    public static void main (String [] args)
            throws java.io.IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите число от 1 до 7: ");
        String vvod = reader.readLine();
        int i = Integer.parseInt(vvod);

        if (i<=7&&i>0&&i!=0) {
            if (i==1)
                System.out.println("понедельник");
            else if (i==2)
                System.out.println("вторник");
            else if (i==3)
                System.out.println("среда");
            else if (i==4)
                System.out.println("четверг");
            else if (i==5)
                System.out.println("пятница");
            else if (i==6)
                System.out.println("суббота");
            else if (i==7)
                System.out.println("воскресенье");
            }
        else{
            System.out.println("такого дня недели не существует");
        }
    }
}
