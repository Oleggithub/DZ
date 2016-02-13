package DZ_7.DZ_7_6_Dop;
class A{
    int x;
    A() {
            System.out.println("class A");
        }
    }
class B extends A{
    int x;

    B(){System.out.println("class B");}

    public static void main(String[] args) {
        A a = new B();
    }

    }


