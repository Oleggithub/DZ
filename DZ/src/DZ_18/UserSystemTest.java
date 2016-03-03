package DZ_18;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;


public class UserSystemTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        User users[] = new DZ_18.User[]{

                new DZ_18.User(12, "test1"),
                new DZ_18.User(13, "test2"),
                new DZ_18.User(14, "test3"),
                new DZ_18.User(14, "test3"),
                null
        };
        Path path = Paths.get("");
        File file = new File(path.toAbsolutePath() + "/test1.txt");
        if (!file.exists()){
            file.createNewFile();
        }
//FileOutputStream(file, true); true - для добавления в файл а не для перезаписи файла
        FileOutputStream fileOutputStream = new FileOutputStream(file, true); // поток для вывода в файл - связь с файлом
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);// тип вывода в файл используя буфер здесь получаем байты
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        // создаем поток который будет записыватьт объекты в кэш
        // в свою очередь byteArrayOutputStream мы используем для того, чтобы вытянуть наши записанные объекты из кеша в виде массива byte
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream); // записывает себе
        for (DZ_18.User objectForWrite : users){
            objectOutputStream.writeObject(objectForWrite); // записываем в кэш во временный буфер
            objectOutputStream.flush(); // проталкивает байты, гарантия того что все записано
        }
        byte [] usersAsBytes = byteArrayOutputStream.toByteArray(); //вытягиваем наши объекты из кэша objectOutputStream
//        fileOutputStream.write(usersAsBytes);
//        fileOutputStream.close();
        bufferedOutputStream.write(usersAsBytes);//записываем в файл
        objectOutputStream.flush();
        fileOutputStream.close();


        //Чтение

        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Object a = null;
        while ((a = objectInputStream.readObject()) != null){// читаем из файла
            System.out.println(a);
        }
        objectInputStream.close();

    }
}
