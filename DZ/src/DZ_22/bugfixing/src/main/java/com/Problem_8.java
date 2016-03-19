package DZ_22.bugfixing.src.main.java.com;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Problem_8 {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream;
        fileInputStream = new FileInputStream("D:\\My_Lessons_Java\\Java_Elementary\\Java_Lessons\\DZ\\src\\DZ_22\\bugfixing\\src\\main\\resources\\test");
       // fileInputStream.class.getResourceAsStream("test");
        //InputStream fileInputStream = (FileInputStream) Problem_8.class.getResourceAsStream("test");
        Properties properties = new Properties();
        properties.load(fileInputStream);
        System.out.println(properties.get("username"));
    }
}
