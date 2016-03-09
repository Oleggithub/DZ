package DZ_19_Socket.DZ_19_1_Object;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ServerSocket serverSocket = new ServerSocket(8080);
        Socket client = serverSocket.accept();
        ObjectInputStream deser = new ObjectInputStream(client.getInputStream());
        ObjectOutputStream ser = new ObjectOutputStream(client.getOutputStream());
        Person person = (Person)deser.readObject();
        person.name = "Oleg_NEW";
        person.sername = "Miroshnichenko_NEW!!!";
        System.out.println(person.name);
        ser.writeObject(person);
        ser.flush();
    }
}
