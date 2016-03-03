package resources.property_config;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyTest {
    public static void main(String[] args) throws IOException {

        //использование getResourceAsStream - стандартный класслоадер
        getPropertyFileByAbsolutePath();
        getPropertyFileByRelPath();
 //       getPropertyFileUsingClassLoader();

        //использование класслоадера

    }

    //КЛАССЛОАДЕР - > АБСОЛЮТНЫЙ ПУТЬ ПО-УМОЛЧАНИЮ, ОПРЕДЕЛЯТЬ СЛЕШ ВПЕРЕДИ - УЖЕ НЕ НУЖНО!! - ЭТО ВАЖНО

    private static void getPropertyFileUsingClassLoader() throws IOException {
        Properties properties = new Properties();
        InputStream resourceAsStream = PropertyTest.class.getClassLoader().
                getResourceAsStream("config.properties");
    //    properties.load(resourceAsStream);
        System.out.println(properties.get("username"));

        resourceAsStream = PropertyTest.class.getClassLoader().
                getResourceAsStream("property_config/config.properties");
        properties.load(resourceAsStream);
        System.out.println(properties.get("username"));

    }

    private static void getPropertyFileByRelPath() throws IOException {
        Properties properties = new Properties();
        InputStream resourceAsStream = PropertyTest.class.getResourceAsStream("config.properties");
        properties.load(resourceAsStream);
        System.out.println(properties.get("username"));
    }

    private static void getPropertyFileByAbsolutePath() throws IOException {
        Properties properties = new Properties();
        InputStream resourceAsStream = PropertyTest.class.getResourceAsStream("config.properties");
        properties.load(resourceAsStream);
        System.out.println(properties.get("username"));
    }
}