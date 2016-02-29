package DZ_17;

import DZ_11.DZ_11_2.User;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerialazibleTest {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("");
        System.out.println(System.getProperty("user.home"));
        File file = new File(path.toAbsolutePath() + "\\test.txt");
        if (!file.exists()){
            file.createNewFile();
        }
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        User user1 = new User("testUser");
        objectOutputStream.writeObject(user1);
        objectOutputStream.close();
    }
}
