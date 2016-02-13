package DZ_13;

import java.util.Scanner;

public class Polindrom_Recursion {
    public static String recursion(String slovo) {

        if (slovo.length() == 1) {
            return "Слово палиндромное";
        } else {
            if (slovo.substring(0,1).equals(slovo.substring(slovo.length() - 1, slovo.length()))) {

                if (slovo.length() == 2) {
                    return "Слово палиндромное";
                }

                return recursion(slovo.substring(1, slovo.length() - 1));
            } else {
                return "Слово не палиндромное";
            }
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите слово: ");
        String scanner = s.nextLine();
        System.out.println(recursion(scanner));
    }
}
