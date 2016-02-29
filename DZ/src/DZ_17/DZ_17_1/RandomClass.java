package DZ_17.DZ_17_1;

import java.io.*;
public class RandomClass implements Serializable {
    private static int random() {
        return (int) (Math.random() * 10);
    }

    private int data_file[];

    public RandomClass() {
        data_file = new int[random()];
        for (int i = 0; i < data_file.length; i++)
            data_file[i] = random();
    }

    public void print() {
        System.out.println("This Class has " + data_file.length + " randoms");
        for (int i = 0; i < data_file.length; i++) {
            System.out.print(data_file[i]);
            System.out.println();
        }
    }
}
