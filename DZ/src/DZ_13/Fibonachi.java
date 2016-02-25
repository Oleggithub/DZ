package DZ_13;

public class Fibonachi {
    public static int f(int n){
        System.out.print(n+ "");
        return n<2?1 : f(n-2)+f(n-1);
    }

    public static void main(String[] args) {
        System.out.println(f(7));
    }
}
