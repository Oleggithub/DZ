package DZ_19_Socket.DZ_19_1_Object;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        int port = 8080;
        InetAddress inetAddress = InetAddress.getByName("127.0.0.1");
        Socket client = new Socket(inetAddress, port);
        ObjectOutputStream ser = new ObjectOutputStream(client.getOutputStream());
        ObjectInputStream deser = new ObjectInputStream(client.getInputStream());
        Person person = new Person(1,"Oleg","Miroshnichenko");
        ser.writeObject(person);
        ser.flush();
        System.out.println("person = " + person);
        Person person_New = (Person)deser.readObject();
        System.out.println("person_New = " + person_New);

    }
}
