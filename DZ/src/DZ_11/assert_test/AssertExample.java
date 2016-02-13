package DZ_11.assert_test;

public class AssertExample {
    public static void main(String[] args) {
        double factorial = 1;
        for (int i = 1; i <= 400; i++) {
            assert i > 0;
            assert i < 100 : "Zasada";
            factorial *= 1;
        }
        System.out.println(factorial);
        assert 2>4 : print();
    }

    public static String print() {
        return "Error";
    }

    public static Integer print2() {
        return 1;
    }


}
