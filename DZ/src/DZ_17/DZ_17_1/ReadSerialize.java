package DZ_17.DZ_17_1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
public class ReadSerialize {
    public static void main (String args[]) throws  IOException, ClassNotFoundException {
        ObjectInputStream in =  new ObjectInputStream (new FileInputStream("My_objects.txt"));
        RandomClass obj1 = (RandomClass)in.readObject();
        RandomClass obj2 = (RandomClass)in.readObject();
        System.out.println("Read.......");
        System.out.println("Two Group of randoms");
        obj1.print();
        obj2.print();
    }
}
