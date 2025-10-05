package by.java.homework.task6;

public class Arrays {
    public static void main(String[] args) {

//        1. Создать массив из 10 элементов. Заполните массив числами и вывести их в консоль (выводите через цикл for each).
//        Замените каждый элемент с нечётным индексом на ноль. Выведите полученный массив в консоль через цикл for each

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int l : array) {
            System.out.print(l);
        }
        System.out.println("\nЗамените каждый элемент с нечётным индексом на ноль:");
        for (int l : array) {
            if (l % 2 != 0) {
                System.out.println("0");
            } else System.out.println(l);
        }


        System.out.println("""
                ***********************************************
                пункт 2:\s
                """);
//        2.    Создать массив из 5 чисел и заполните этот массив вручную. Создайте второй массив с размерностью больше на 1
//        чем первый массив. Необходимо скопировать первый массив со всеми значениями во второй массив.
//        Последний элемент во втором массиве пусть будет 0. Выведите второй массив в консоль с помощью цикла for each.
        int[] array1 = {5, 4, 3, 2, 1};
        int[] array2 = new int[array1.length + 1];
        int i = 0;
        for (int x : array1) {
            array2[i] = x;
            i++;
        }
        if (i < array2.length) {
            array2[i] = 0;
        }
        System.out.println(java.util.Arrays.toString(array2));


        System.out.println("""
                ***********************************************
                пункт 3:\s
                """);
//        3.* Создать массив вручную. Заменить максимальный и минимальный элемент массива. Новый минимальный элемент будет (-1000),
//        новый максимальный элемент 1000.

        int[] array3 = {3, 155, 9, 1, 25, 70, -5, 150};
        int min = array3[0];
        int max = array3[0];
        int k = 0;
        int nMin = 0;
        int nMax = 0;

        for (int n : array3) {
            if (n <= min) {
                min = n;
                nMin = k;
            }
            if (n > max) {
                max = n;
                nMax = k;
            }
            k++;

        }
        array3[nMin] = -1000;
        array3[nMax] = 1000;

        System.out.println(java.util.Arrays.toString(array3));


        System.out.println("""
                ***********************************************
                пункт 4:\s
                """);
//        4.* Создать массив (вручную). Отсортировать элементы массива в порядке возрастания.
//        Вывести полученный массив. Выполнить с помощью цикла for

        int[] array4 = {7, 70, 6, 95, 23, 44, 1};
        int temp;

        for (int s : array4) {
            for (int a = 0; a < array4.length - 1; a++) {
                if (array4[a] > array4[a + 1]) {
                    temp = array4[a];
                    array4[a] = array4[a + 1];
                    array4[a + 1] = temp;
                }
            }
        }
        System.out.println(java.util.Arrays.toString(array4));

    }
}
