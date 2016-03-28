package DZ_22.bugfixing.src.main.java.com;

public class Problem_7 {
    class A {
        private int aValue;
        private B bValue = null;

        public A() {
            aValue = 0;
            bValue = new B(this);
        }

        @Override
        public String toString() {
            return "";
        }
    }

    class B {
        private int bValue;
        private A aInstance = null;

        public B(A a) {
            bValue = 10;
            aInstance = a;
        }

        @Override
        public String toString() {
            return "";
        }
    }

    public static void main(String[] args) {
        A obj = new Problem_7().new A();
        System.out.println(obj.toString());
    }

}
