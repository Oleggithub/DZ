package DZ_24;

public class svg {
    public static void main(String[] args) {
        f(8);
        System.out.println("args = " + f(8));

        }

    private static int f(int n) {
        if (n<3){
           return 1;
        }
        return f(n-1)+f(n-2);
    }
}

