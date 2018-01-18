package by.it.oymarygold.lesson04;

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
        int m1, m2, m3, m4, m5, m6, m7, m8, m9, m10, m11, m12;
        m1 = m3 = m5 = m7 = m8 = m10 = m12 = 31;
        m4 = m6 = m9 = m11 = 30;
        m2 = 28;
        if (month >= 1 && month <= 12) {
            switch (month) {
                case 1:
                    if (date <= m1) System.out.println(date);
                    else System.out.println("Нет такой даты в указанном месяце");
                    break;
                case 2:
                    if (date <= m2) System.out.println(m1 + date);
                    else System.out.println("Нет такой даты в указанном месяце");
                    break;
                case 3:
                    if (date <= m3) System.out.println(m1 + m2 + date);
                    else System.out.println("Нет такой даты в указанном месяце");
                    break;
                case 4:
                    if (date <= m4) System.out.println(m1 + m2 + m3 + date);
                    else System.out.println("Нет такой даты в указанном месяце");
                    break;
                case 5:
                    if (date <= m5) System.out.println(m1 + m2 + m3 + m4 + date);
                    else System.out.println("Нет такой даты в указанном месяце");
                    break;
                case 6:
                    if (date <= m6) System.out.println(m1 + m2 + m3 + m4 + m5 + date);
                    else System.out.println("Нет такой даты в указанном месяце");
                    break;
                case 7:
                    if (date <= m7) System.out.println(m1 + m2 + m3 + m4 + m5 + m6 + date);
                    else System.out.println("Нет такой даты в указанном месяце");
                    break;
                case 8:
                    if (date <= m8) System.out.println(m1 + m2 + m3 + m4 + m5 + m6 + m7 + date);
                    else System.out.println("Нет такой даты в указанном месяце");
                    break;
                case 9:
                    if (date <= m9) System.out.println(m1 + m2 + m3 + m4 + m5 + m6 + m7 + m8 + date);
                    else System.out.println("Нет такой даты в указанном месяце");
                    break;
                case 10:
                    if (date <= m10) System.out.println(m1 + m2 + m3 + m4 + m5 + m6 + m7 + m8 + m9 + date);
                    else System.out.println("Нет такой даты в указанном месяце");
                    break;
                case 11:
                    if (date <= m11) System.out.println(m1 + m2 + m3 + m4 + m5 + m6 + m7 + m8 + m9 + m10 + date);
                    else System.out.println("Нет такой даты в указанном месяце");
                    break;
                case 12:
                    if (date <= m12)
                        System.out.println(m1 + m2 + m3 + m4 + m5 + m6 + m7 + m8 + m9 + m10 + m11 + date);
                    else System.out.println("Нет такой даты в указанном месяце");
                    break;
                default:
            }
        } else {
            System.out.println("Нет такого месяца");
        }
    }
}
