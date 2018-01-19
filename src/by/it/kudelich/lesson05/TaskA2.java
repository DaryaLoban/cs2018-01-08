package by.it.kudelich.lesson05;

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
import java.util.*;

public class TaskA2 {

    public static void main(String[] args) {
        ArrayList<String> obj = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);

        int i = 1;
        while(i != 0) {
            String strVal = sc.nextLine();
            if (!strVal.equals("END")) {
                obj.add(strVal);
            } else {
                i = 0;
            }
        }
        System.out.print(obj);

    }

}
