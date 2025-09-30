package by.java.homework.task5;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
//     1. Вывести все числа кратные 7 или 3 в диапазоне от 1 до100. (можно использовать цикл for)

        int i;
        for (i=1; i<100; i++){
            if (i%3==0) System.out.println("число кратное 3 ="+ i);
            if (i%7==0) System.out.println("число кратное 7 =" + i);
            }

        System.out.println("""
                ***********************************************
                пункт 2:\s
                """);
        /*  2. Ввести 2 положительных числа с консоли с помощью сканера.
        Вывести сумму всех чисел от одного числа до другого. (Используйте цикл while).
        Подсказка. До цикла объявите переменную int sum=0.
        В самом цикле перезаписывайте в эту переменную сумму чисел.*/
        Scanner in = new Scanner(System.in);
        System.out.println("введите число а");
        int a = in.nextInt();
        System.out.println("введите число b");
        int b = in.nextInt();
        int sum = 0;

        if (a < b) {
            while (++a < b) {
                sum += a;
            }
        } else while (++b < a) {
            sum += b;
        }

        System.out.println("сумма всех чисел между a и b = " + sum);


        System.out.println("""
                ***********************************************
                пункт 3:\s
                """);
        /* 3* . Ввести число с консоли, которое не заканчивается на 0.
        Вывести число в обратном порядке. Использовать оператор %.*/
        System.out.println("введите число c, которое не заканчивается на 0");
        int c = in.nextInt();
        if (c % 10 == 0) {
            System.out.println("введено некорректное число");
        } else {
            int reverse = 0;
            while (c != 0) {
                int lastN = c%10;
                reverse = reverse *10 + lastN;
                c=c/10;
            }
            System.out.println("реверс числа с = " + reverse);
        }


        System.out.println("""
                ***********************************************
                пункт 4:\s
                """);
        /* 4*. Ввести число с консоли, которое не заканчивается на 0.
        Вывести чётные и нечётные числа через while and if. Использовать оператор %.*/
        System.out.println("введите число d, которое не заканчивается на 0");
        int d = in.nextInt();

        if (d % 10 == 0) {
            System.out.println("введено некорректное число");
        } else
            while (d > 0) {
                if (d % 2 == 0) {
                    System.out.println("четное число: " + d);
                } else System.out.println("нечетное число: " + d);
                d--;
            }
    }
}


