package DZ_21;

import java.util.Iterator;

public class MyMapTest {
    public static void main(String[] args) {
        MyMap<Integer,String> myMap = new MyMap<Integer, String>();
        myMap.put(7, "Jenya");
        myMap.put(37, "Oleg");
       // myMap.put(11,"Oleg2");
       // myMap.put(12,"Oleg3");
        System.out.println(myMap);
        myMap.remove1(7);
        System.out.println(myMap);
//        myMap.remove(2, "");
//        myMap.remove(1, "");
//        System.out.println(myMap);
        Iterator iterator = myMap.iterator(); // стучимся к мапе с помощью итератора
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
