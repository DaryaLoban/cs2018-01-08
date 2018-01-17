package by.it.daryaloban.lesson04;

import java.util.Scanner;

/*
На входе вводится число и месяц 2017 года.
Программа должна выводить номер дня года, считая 1 января первым днем,
а 31 декабря 365-м.

Пример:
Ввод:
1 1

Вывод
1

Ввод:
31 12

Вывод
365

Ввод:
13 9

Вывод
256

 */
public class TaskC2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int date = sc.nextInt();
        int month = sc.nextInt();
        int jan = 31, feb = 28, mar = 31, apr = 30,  may = 31, jun = 30, jul = 31, aug = 31, sep = 30, oct = 31,  nov = 30, dec = 31;

        switch (month) {
            case 1:
                System.out.println(date);
                break;
            case 2:
                System.out.println(jan + date);
                break;
            case 3:
                System.out.println((jan + feb) + date);
                break;
            case 4:
                System.out.println((jan + feb + mar) + date);
                break;
            case 5:
                System.out.println((jan + feb + mar + apr) + date);
                break;
            case 6:
                System.out.println((jan + feb + mar + apr + may ) + date);
                break;
            case 7:
                System.out.println((jan + feb + mar + apr + may + jun) + date);
                break;
            case 8:
                System.out.println((jan + feb + mar + apr + may + jun + jul) + date);
                break;
            case 9:
                System.out.println((jan + feb + mar + apr + may + jun + jul + aug) + date);
                break;
            case 10:
                System.out.println((jan + feb + mar + apr + may + jun + jul + aug + sep) + date);
                break;
            case 11:
                System.out.println((jan + feb + mar + apr + may + jun + jul + aug + sep + oct) + date);
                break;
            case 12:
                System.out.println((jan + feb + mar + apr + may + jun + jul + aug + sep + oct + nov) + date);
                break;
        }
    }
}
