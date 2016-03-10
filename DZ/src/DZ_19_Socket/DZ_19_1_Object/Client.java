package DZ_19_Socket.DZ_19_1_Object;

import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Client {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        int port = 8080;
        InetAddress inetAddress = InetAddress.getByName("127.0.0.1");
        Socket client = new Socket(inetAddress, port);

        Path path = Paths.get("");

        File file = new File(path.toAbsolutePath() + "/test2.txt");
        if (!file.exists()) {
            file.createNewFile();
        }

        PrintWriter out_file = new PrintWriter(file.getAbsoluteFile());

        ObjectOutputStream ser = new ObjectOutputStream(client.getOutputStream());
        ObjectInputStream deser = new ObjectInputStream(client.getInputStream());
        Person person = new Person(1, "Oleg", "Miroshnichenko");
        ser.writeObject(person);
        ser.flush();
        System.out.println("--------------------------------------------");
        System.out.println("Объект до изменения");
        System.out.println("person = " + person);
        System.out.println("Объект после изменения");
        Person person_New = (Person) deser.readObject();
        System.out.println("person_New = " + person_New);
        System.out.println("--------------------------------------------");
        System.out.println("Пишем в файл -> " + file.getName());
        out_file.print(person);
        out_file.print(person_New);
        out_file.close();
        System.out.println("Объекты записаны в файл -> " + file.getName());
        System.out.println("--------------------------------------------");
    }
}
