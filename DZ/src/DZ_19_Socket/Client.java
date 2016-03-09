package DZ_19_Socket;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {

        int port = 8080;
        InetAddress inetAddress = InetAddress.getByName("127.0.0.1");
        Socket client = new Socket(inetAddress, port);
//Канал для сервера
        OutputStream outputStream = client.getOutputStream(); // выводит в байтах
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream); // обертываем в ДАТА для получения строки
// Канал для клиента
        InputStream inputStream = client.getInputStream();// выводит в байтах
        DataInputStream dataInputStream = new DataInputStream(inputStream);// обертываем в ДАТА для получения строки

        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(new File("D:/My_Lessons_Java/Java_Elementary/Java_Lessons/DZ/src/resources/numbers.txt")));
//        byte buf[] = new byte[1024];
//        while (bufferedInputStream.read(buf)>0){
//            System.out.println(new String(buf));
//        }
        DataInputStream fileInputStream = new DataInputStream(bufferedInputStream);
        String number;
        while ((number = fileInputStream.readLine()) != null){

            System.out.println("client is sending number :" + number);
            dataOutputStream.writeUTF(number);
            dataOutputStream.flush(); // записали на сервер

            Integer answerFromServerSide = dataInputStream.readInt();
            System.out.println("answerFromServerSide = " + answerFromServerSide);

        }
        dataInputStream.close();
        dataOutputStream.close();
    }
}
