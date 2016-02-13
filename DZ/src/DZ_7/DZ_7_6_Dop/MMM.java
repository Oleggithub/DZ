package DZ_7.DZ_7_6_Dop;
class MyVector {
    int i = 1;

    public MyVector() {
        i = 2;
    }

    public int getI() {
        return i;
    }

}

class MyNewVector extends MyVector {
    int i = 0;

    public MyNewVector() {
        i = 4;
    }

    @Override
    public int getI() {
        return i;
    }
    public static void main(String args[]) {
        MyVector myvector = new MyNewVector();
        System.out.println("myvector = " + myvector.getI());
        System.out.println("myvector = " + myvector.i);
        /*
        создайте ОДИН инстанс объекта таким образом,ffff
        чтобы при обращении к переменной i в одном случае -> было выведено 2, в другом случае -> 4
        главные условия:
       1) ничего в классе MyVector and MyNewVector менять нельзя
       2) сетить значения для i super класса или класса наследника - запрещено :)
      */
    }
}