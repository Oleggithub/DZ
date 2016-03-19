package DZ_22.bugfixing.src.main.java.com;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Problem_9 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("");
        File file = new File(path.toAbsolutePath() + "test7.txt");
        if (!file.exists()){
            file.createNewFile();
        }
//        File file=new File("test.txt");
//        System.out.println(file.exists());
        Scanner scan=new Scanner(file);
//        System.out.println(scan.hasNext());
        if(scan.hasNext()){
            while(scan.hasNext()){System.out.println(scan.next());}
        } else {
            System.out.println(scan.hasNext());
        }
        scan.close();
    }

}
