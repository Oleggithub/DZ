package DZ_18.DZ_18_1;

import resources.property_config.Property_User_Test_DZ_18_1;

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

public class UserTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        User users [] = new User[]{
                new User("Oleg", "Niro", "Eko", "Miro" ),
                new User("Oleg1", "Niro1", "Eko1", "Miro1" ),
                new User("Oleg2", "Niro2", "Eko2", "Miro2" ),

                null

         };
        Path path = Paths.get("");
        File file = new File(path.toAbsolutePath() + "/parameters.txt");
        if (!file.exists()){
            file.createNewFile();
        }
        //FileOutputStream(file, true); true - для добавления в файл а не для перезаписи файла
        FileOutputStream fileOutputStream = new FileOutputStream(file); // поток для вывода в файл - связь с файлом
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);// тип вывода в файл используя буфер здесь получаем байты
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        // создаем поток который будет записыватьт объекты в кэш
        // в свою очередь byteArrayOutputStream мы используем для того, чтобы вытянуть наши записанные объекты из кеша в виде массива byte
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream); // записывает себе
        for (User objectForWrite : users){
            objectOutputStream.writeObject(objectForWrite); // записываем в кэш во временный буфер
            objectOutputStream.flush(); // проталкивает байты, гарантия того что все записано
        }
        byte [] usersAsBytes = byteArrayOutputStream.toByteArray(); //вытягиваем наши объекты из кэша objectOutputStream
        fileOutputStream.write(usersAsBytes);
        fileOutputStream.close();
//        bufferedOutputStream.write(usersAsBytes);//записываем в файл
//        objectOutputStream.flush();
//        fileOutputStream.close();

        //Чтение

        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Object o = null;
        while ((o = objectInputStream.readObject()) != null){// читаем из файла
            //System.out.println(o);
            if (o.getClass().getClassLoader().getResource("username") == Property_User_Test_DZ_18_1.class.getClassLoader().getResource("username")){
                System.out.println("o.getClass() = " + o.getClass().getClassLoader().getResource("username"));
                System.out.println(Property_User_Test_DZ_18_1.class.getClassLoader().getResource("username"));
                System.out.println(Property_User_Test_DZ_18_1.class.getMethods());

                System.out.println("o = " + o);
                //o.equals(objectInputStream.available());
                //System.out.println(o.equals(Property_User_Test_DZ_18_1.class.getClassLoader().getResource("username")));
            }
        }
        objectInputStream.close();


    }

}
