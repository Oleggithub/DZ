package DZ_20.collection_Test;

import java.util.Iterator;

public class MyArrayTest {
    public static void main(String[] args) {
        MyArray<Integer> myArray = new MyArray();
        for (int i = 0; i < 18; i++) {
            myArray.add(i);
        }
        System.out.println(myArray);
        myArray.remove(2); // удаляю второй элемент
        System.out.println(myArray);
        myArray.trimToSize();
        myArray.printMyArray();//вывод без костыля
        Iterator<Integer> iterator = myArray.iterator();
        while(iterator.hasNext()){
            System.out.println("---->>>>>" + iterator.next());
        }
    }
}
