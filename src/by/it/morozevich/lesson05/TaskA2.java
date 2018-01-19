package by.it.morozevich.lesson05;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.in;

/*
Создайте список строк.
Вводите строки с клавиатуры, пока пользователь не введет слово END.
Каждую введенную строку, кроме слова END добавьте в список типа ArrayList.

Напечатайте список, не используйте для этого цикл.
Список - это объект. Его можно просто напечатать, как переменную.

Для вот такого ввода:
ONE
TWO
THREE
FOUR
FIVE
END
Ожидается такой вывод:
[ONE, TWO, THREE, FOUR, FIVE]

*/
public class TaskA2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(in);
        ArrayList<String> List=new ArrayList <>();
        String Line;
        while (!(Line=sc.nextLine()).equals("end")) {
            List.add (Line);
        }
        System.out.println(List);

    }
}
