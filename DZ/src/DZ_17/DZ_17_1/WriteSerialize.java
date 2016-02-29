package DZ_17.DZ_17_1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
public class WriteSerialize {
    public static void main (String args[]) throws IOException {
        RandomClass obj1 = new RandomClass();
        RandomClass obj2 = new RandomClass();
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("My_objects.txt"));
        out.writeObject(obj1);
        out.writeObject(obj2);
        out.close();
        System.out.println("Write.......");
        System.out.println("Two Group of randoms");
        obj1.print();
        obj2.print();
    }
}
