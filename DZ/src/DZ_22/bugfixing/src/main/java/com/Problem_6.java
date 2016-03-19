package DZ_22.bugfixing.src.main.java.com;

public class Problem_6 {

    public static void recursivePrint(int num) {
        System.out.println("Number: " + (num));

        if (num == 100)
            return;
        else
            recursivePrint(++num);
    }

    public static void main(String[] args) {

        recursivePrint(1);
    }

}
