package DZ_19_Socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8080);
        Socket accept = serverSocket.accept(); // сервер ожидает клиента для 1 клиента

        InputStream inputStream = accept.getInputStream();
        OutputStream outputStream = accept.getOutputStream();
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);

        while (true){
            String messageFromClient = dataInputStream.readUTF();
            System.out.println("hi, client; " + "you have sent number likes =  " + messageFromClient);

            Integer integer = Integer.valueOf(messageFromClient)*2;
            dataOutputStream.writeInt(integer);
            dataOutputStream.flush();
        }
    }
}
