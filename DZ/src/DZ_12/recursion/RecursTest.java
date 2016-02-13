package DZ_12.recursion;

import java.util.Arrays;

public class RecursTest {
    public static void main(String[] args) {
        printNumbers(0);
        int factorial = factorial(3);
        System.out.println("factorial = " + factorial);
        //Бинарная сортировка
        int mas[] = {5, 1, 10, 56, 123};
        Arrays.sort(mas);
        System.out.println(Arrays.toString(mas));
        int i = binarySearch(mas, 0, mas.length, 56);
        System.out.println("i = " + i);
    }

    public static int binarySearch(int mas[], int min, int max, int keySearch) {
        int avgIntex = (max - min) / 2 + min;// = 3 индекс
        if (keySearch < mas[avgIntex]) {
            return binarySearch(mas, min, avgIntex, keySearch);
        }
        if (keySearch > mas[avgIntex]) {
            return binarySearch(mas, avgIntex, max, keySearch);
        }
        return avgIntex;
    }

    public static void printNumbers(int a) {
        //System.out.println(a);
        if (a < 3) {
            //printNumbers(a); //Бесконечная рекурсия
            printNumbers(++a);
        }
        System.out.println(a);
    }

    public static int factorial(int f) {
        if (f == 1) return 1; // выход из рекурсии
        return f * factorial(--f);
    }
}
