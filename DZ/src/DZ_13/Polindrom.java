package DZ_13;

import java.util.Scanner;

public class Polindrom {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите слово из пяти букв: ");
        String scanner = s.nextLine();
        if (scanner.length() != 5) {
            System.out.println("Вы ввели не пять букв");
        } else {
            String proverka = new StringBuilder(scanner).reverse().toString();
            if (scanner.equalsIgnoreCase(proverka)) {
                System.out.println("Слово: " + scanner + " - палиндромное.");
            } else {
                System.out.println("Слово: " + scanner + " - не палиндромное.");
            }
        }
    }
}
