package DZ_21;

public class MyMapTest {
    public static void main(String[] args) {
        MyMap<Integer,String> myMap = new MyMap<Integer, String>();
        myMap.put(1,"Oleg");
        myMap.put(2,"Jenya");
        System.out.println(myMap);
        myMap.remove(2, "");
        System.out.println(myMap);
    }
}
