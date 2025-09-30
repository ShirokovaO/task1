package by.java.homework.task4;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        //1. На вход даны 3 числа. Вывести в консоль только четные числа

        Scanner in = new Scanner(System.in);
        System.out.println("введите число a");
        int a = in.nextInt();
        System.out.println("введите число b");
        int b = in.nextInt();
        System.out.println("введите число c");
        int c = in.nextInt();

        if (a % 2 == 0) System.out.println(a + " a - четное число");
        if (b % 2 == 0) System.out.println(b + " b - четное число");
        if (c % 2 == 0) System.out.println(c + " c - четное число");

        System.out.println("""
                ***********************************************
                пункт 2:\s
                """);

        //2. На вход даны 3 числа. Вывести в консоль только те числа, которые делятся на 2 и на 5
        // (используйте оператор % для проверки деления без остатка)

        if (a % 2 == 0) System.out.println(a + " a - делится на 2");
        if (a % 5 == 0) System.out.println(a + " a - делится на 5");
        if (b % 2 == 0) System.out.println(b + " b - делится на 2");
        if (b % 5 == 0) System.out.println(b + " b - делится на 5");
        if (c % 2 == 0) System.out.println(c + " c - делится на 2");
        if (c % 5 == 0) System.out.println(c + " c - делится на 5");


        System.out.println("""
                ***********************************************
                пункт 3:\s
                """);


        //3. Дано 15/x=result, где x-число, которое вводится с командной строки,
        // result-результат вычисления. Написать программу, которая будет выводит разный текст,
        // в зависимости от значения result. В случае result=3,
        // вывести: "Результат деления равен 3" В случае result=5 вывести:
        // "Результат деления равен 5" В других случаях вывести:
        // "Результат деления равен дробному числу". При этом в последнем случае вывести
        // точный результат деления (использовать приведение типов)

        System.out.println("введите число x");
        int x = in.nextInt();

        if (15.0 / x % 3 == 0 | 15.0 / x % 5 == 0) {
            int r = (int) (15.0 / x);
            switch (r) {
                case 3:
                    System.out.println("Результат деления равен 3");
                    break;
                case 5:
                    System.out.println("Результат деления равен 5");
                    break;
            }
        }
        else
            switch (15 / x) {
                default:
                    double result = 15.0 / x;
                    System.out.println("Результат деления равен дробному числу: " + result);
            }

        }
    }

