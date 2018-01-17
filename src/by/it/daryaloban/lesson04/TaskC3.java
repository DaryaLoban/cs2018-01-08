package by.it.daryaloban.lesson04;

/*
Вывести таблицу умножения 10 x 10 (двоныйм циклом),
но вывод должен быть словами:

Ожидаемый вывод:
два умножить на два равно четыре
два умножить на три равно шесть
два умножить на четыре равно восемь
два умножить на пять равно десять
два умножить на шесть равно двенадцать
два умножить на семь равно четырнадцать
два умножить на восемь равно шестнадцать
два умножить на девять равно восемнадцать
два умножить на десять равно двадцать
три умножить на два равно шесть
три умножить на три равно девять
три умножить на четыре равно двенадцать
...
и т.д. до фразы
...
десять умножить на десять равно сто
*/

public class TaskC3 {
    public static void main(String[] args) {
        int i, j, mul;
        for (i = 1; i <= 10; i++) {
            j = 1;
            for (j = 1; j <= 10; j++) {
                mul = i * j;
                if (i != 1 && j != 1) System.out.println(convertToStringI(i) + " умножить на " + convertToStringJ(j) +
                        " равно " + convertToStringMul(mul));
                else continue;

            }
        }
    }

    public static String convertToStringI(int i) {
        String str1 = String.valueOf(i);

        switch (str1) {
            case "2":
                str1 = "два";
                break;
            case "3":
                str1 = "три";
                break;
            case "4":
                str1 = "четыре";
                break;
            case "5":
                str1 = "пять";
                break;
            case "6":
                str1 = "шесть";
                break;
            case "7":
                str1 = "семь";
                break;
            case "8":
                str1 = "восемь";
                break;
            case "9":
                str1 = "девять";
                break;
            case "10":
                str1 = "деcять";
                break;
        }
        return str1;


    }

    public static String convertToStringJ(int j) {
        String str2 = String.valueOf(j);
        switch (str2) {
            case "2":
                str2 = "два";
                break;
            case "3":
                str2 = "три";
                break;
            case "4":
                str2 = "четыре";
                break;
            case "5":
                str2 = "пять";
                break;
            case "6":
                str2 = "шесть";
                break;
            case "7":
                str2 = "семь";
                break;
            case "8":
                str2 = "восемь";
                break;
            case "9":
                str2 = "девять";
                break;
            case "10":
                str2 = "деcять";
                break;


        }

        return str2;
    }

    public static String convertToStringMul(int mul) {
        String str_mul = String.valueOf(mul);
        switch (str_mul) {
            case "4":
                str_mul = "четыре";
                break;
            case "6":
                str_mul = "шесть";
                break;
            case "8":
                str_mul = "восемь";
                break;
            case "9":
                str_mul = "девять";
                break;
            case "10":
                str_mul = "деcять";
                break;
            case "12":
                str_mul = "двенадцать";
                break;
            case "14":
                str_mul = "четырнадцать";
                break;
            case "15":
                str_mul = "пятнадцать";
                break;
            case "16":
                str_mul = "шестнадцать";
                break;
            case "18":
                str_mul = "восемнадцать";
                break;
            case "20":
                str_mul = "двадцать";
                break;
            case "21":
                str_mul = "двадцать один";
                break;
            case "24":
                str_mul = "двадцать четыре";
                break;
            case "25":
                str_mul = "двадцать пять";
                break;
            case "27":
                str_mul = "двадцать семь";
                break;
            case "28":
                str_mul = "двадцать восемь";
                break;
            case "30":
                str_mul = "тридцать";
                break;
            case "32":
                str_mul = "тридцать два";
                break;
            case "35":
                str_mul = "тридцать пять";
                break;
            case "36":
                str_mul = "тридцать шесть";
                break;
            case "40":
                str_mul = "сорок";
                break;
            case "42":
                str_mul = "сорок два";
                break;
            case "45":
                str_mul = "сорок пять";
                break;
            case "48":
                str_mul = "сорок восемь";
                break;
            case "49":
                str_mul = "сорок девять";
                break;
            case "50":
                str_mul = "пятьдесят";
                break;
            case "54":
                str_mul = "пятьдесят четыре";
                break;
            case "56":
                str_mul = "пятьдесят шесть";
                break;
            case "60":
                str_mul = "шестьдесят";
                break;
            case "63":
                str_mul = "шестьдесят три";
                break;
            case "64":
                str_mul = "шестьдесят четыре";
                break;
            case "70":
                str_mul = "семьдесят";
                break;
            case "72":
                str_mul = "семьдесят два";
                break;
            case "80":
                str_mul = "восемьдесят";
                break;
            case "81":
                str_mul = "восемьдесят один";
                break;
            case "90":
                str_mul = "девяносто";
                break;
            case "100":
                str_mul = "сто";
                break;
        }
        return str_mul;
    }
}
