package DZ_10.Test_Exeption_try_catch;

public class Foo7 {
    public static void main(String[] args) {
        try {
            badMethod();
            System.out.print("A");
        } catch (Exception ex) {
            System.out.print("B");
        } finally {
            System.out.print("C");
        }
        System.out.print("D");
    }

    public static void badMethod() {
    }

}

